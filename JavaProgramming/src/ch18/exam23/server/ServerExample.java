package ch18.exam23.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application {
	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<>();		//리스트안에 클라이언트를 담아둔다
	
	void startServer() {		//스타트를 누르면 이메소드가 실행
		
		//스레드풀 생성(최대 스레드 50개만 사용)
		executorService = Executors.newFixedThreadPool(50);		
		
		//ServerSocket 생성(5001번 포트를 사용)
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.0.17", 5001));	//실제로 이러면 안되고 로컬호스트에 아이피를 넣어주어야한다.
		} catch (Exception e){
			if(!serverSocket.isClosed());{ stopServer(); }
			return;
		}
		
		//클라이언트 연결 수락 작업 생성과 작업큐에 넣기
		Runnable runnable = new Runnable(){
			@Override
			public void run() { 
				Platform.runLater(new Runnable(){
					@Override
					public void run() {			//ui변경 작업은 여기내에서 해야함
						displayText("[서버시작]");
						btnStartStop.setText("stop");		//버튼의 글자를 이걸로바꾸기
					}
				});
				
				while(true){
					try{
						//클라이언트의 연결을 기다리고 수락하기
						Socket socket = serverSocket.accept();
						String message = "[연결 수락: " + socket.getInetAddress().getHostAddress() + ":" + Thread.currentThread().getName() +"]";		
						Platform.runLater(new Runnable(){
							@Override
							public void run() {			//ui변경 작업은 여기내에서 해야함
								displayText(message);
							}
						});
						//통신객체 Client 생성
						Client client = new Client(socket);
						
						//클라이언트 관리
						connections.add(client);
						Platform.runLater(new Runnable(){
							@Override
							public void run() {			//ui변경 작업은 여기내에서 해야함
								displayText("[연결 개수: " + connections.size());		// 연결된 클라이언트수 확인
							}
						});
						
					}catch(Exception e) {
						if(serverSocket.isClosed()){stopServer();}
						break;
					}
				}
			}
		};
		executorService.submit(runnable);
		
	}
	
	void stopServer() {
		try{
			Iterator<Client> iterator = connections.iterator();
			while(iterator.hasNext()){
				Client client = iterator.next();
				client.socket.close();	//리스트에서 종료된 클라이언트 제거
				iterator.remove();		//커넥션에서 지우기
			}
			
			if(serverSocket != null && !serverSocket.isClosed()){	//널이아닌면서 닫혀잊지도 않다면 닫아라
				serverSocket.close();
			}
			if(executorService != null && !executorService.isShutdown()){	
				executorService.shutdownNow();
			}
			Platform.runLater(new Runnable(){
				@Override
				public void run() {			//ui변경 작업은 여기내에서 해야함
					displayText("[서버 멈춤]");
					btnStartStop.setText("start");		//버튼의 글자를 이걸로바꾸기
				}
			});
		} catch(Exception e) {}
		
	}	
	
	class Client {
		Socket socket;
		
		Client(Socket socket) {
			this.socket = socket;
			receive();
		}
		void receive(){
			//클라이언트의 데이터를 받는 작업 생성 및 작업큐에 넣기
			Runnable runnable = new Runnable(){
				@Override
				public void run() {
					try{
						while(true){
							InputStream is = socket.getInputStream();
							byte[] values = new byte[1024];
							int byteNum = is.read(values);
							if(byteNum == -1) { throw new IOException();}
							String data = new String(values, 0, byteNum, "UTF-8");
							for(Client client : connections) {		//모든클라이언트에 센드메소드라 실행
								client.send(data);
							}
						}
					}catch(Exception e){
						try {
							connections.remove(Client.this);		//현재 클라이언트 커넥트에서 제거
							String message = "[클라이언트 통신 안됨: " + socket.getInetAddress().getHostAddress() + ":" + Thread.currentThread().getName() +"]";	//어떤아이피주소 , 어떤스레드
							Platform.runLater(new Runnable(){
								@Override
								public void run() {			//ui변경 작업은 여기내에서 해야함
									displayText(message);
								}
							});
							socket.close();
						} catch(IOException e1) {}
					}
				}
			};
			executorService.submit(runnable);		//작업큐에 넣기
		}
		
		void send(String data){
			//클라이언트로 데이터를 보내는 작업 생성 및 작업 큐에 넣기
			Runnable runnable = new Runnable(){
				@Override
				public void run() {
					try{
						OutputStream os = socket.getOutputStream();
						byte[] values = data.getBytes("UTF-8");
						os.write(values);		//클라이언트가 없으면 예외 발생할수 있음
						os.flush();
					}catch(Exception e){
						try {
							connections.remove(Client.this);		//현재 클라이언트 커넥트에서 제거
							String message = "[클라이언트 통신 안됨: " + socket.getInetAddress().getHostAddress() + ":" + Thread.currentThread().getName() +"]";	//어떤아이피주소 , 어떤스레드
							Platform.runLater(new Runnable(){
								@Override
								public void run() {			//ui변경 작업은 여기내에서 해야함
									displayText(message);
								}
							});
							socket.close();
						} catch(IOException e1) {}
					}
				}
			};
			executorService.submit(runnable);		//작업큐에 넣기
		}
	}
	
	//////////////////////////////////////////////////////
	TextArea txtDisplay;
	Button btnStartStop;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0,0,2,0));
		root.setCenter(txtDisplay);
		
		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		btnStartStop.setOnAction(e->{
			if(btnStartStop.getText().equals("start")) {
				startServer();
			} else if(btnStartStop.getText().equals("stop")){
				stopServer();
			}
		});
		root.setBottom(btnStartStop);
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Server");
		primaryStage.setOnCloseRequest(event->stopServer());
		primaryStage.show();
	}
	
	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}	
	
	public static void main(String[] args) {
		launch(args);
	}
}
