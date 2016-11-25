package ch12.exam14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteServiceExmample {

	public static void main(String[] args) {
		//ThreadPool 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		//작업생성
		Runnable task = new Runnable(){
			@Override
			public void run() {
				for(int i=0; i<10; i++){
					System.out.println("실행 중...:" + Thread.currentThread().getName());
					
					
				}
			}
		};
		
		//작업 큐에 작업 넣기
		executorService.submit(task);
		
		//ThreadPool 종료
		executorService.shutdown();		//작업처리 마무리하고 스레드풀 종료
		
	}

}
