package ch18.exam17.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			//서버의 어떤 IP라도 접근할 수 있도록 한 것
			serverSocket = new ServerSocket(5001);		//5001번 포트 사용
			
			//서버의 특정 IP로 접근할 수 있도록 한 것
			
			/*serverSoket = new ServerSocket();
			SocketAddress sa = new InetSocketAddress("192.168.0.17", 5001);
			serverSoket.bind(sa);*/
			
			for(int i=0;i<10; i++){		//와일문 계속 연결을 수락한다는것	//포문 횟수만 수락 	
				//클라이언트의 연결을 수락하고 통신용 Socket 을 생성
				System.out.println("[클라이언트의 연결을 기다림]");
				Socket socket = serverSocket.accept();		//연결수락을 대기 	//수락되면 통신 리턴
				
				//클라이언트의 IP정보 얻기
				String clientIP = socket.getInetAddress().getHostAddress();
				System.out.println("[클라이언트의(" + clientIP + ") 연결을 수락함]");
				
				//클라이언트의 연결을 끊음
				socket.close();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			serverSocket.close();
		} catch (IOException e) {}
		
	}

}
