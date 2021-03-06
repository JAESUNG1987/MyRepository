package ch12.exam14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteServiceExmample3 {

	public static void main(String[] args) {
		//ThreadPool 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);		//쓰레드5개 생성
		
		//작업생성
		for(int i=1; i<10; i++) {		//작업 10개 생성
			int count = i;
			Runnable task = new Runnable(){
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;		//실제스레드 개수 알아보기
					System.out.println("스레드의 총수:" + threadPoolExecutor.getPoolSize());
					System.out.println("실행("+ count +")" + Thread.currentThread().getName());
					int value = Integer.parseInt("aa");	//NumberFormatException 발생
				}
			};
			
			//작업 큐에 작업 넣기
			executorService.submit(task);
			//executorService.execute(task);
		}
		
		//ThreadPool 종료
		executorService.shutdown();		//작업처리 마무리하고 스레드풀 종료
		
	}

}
