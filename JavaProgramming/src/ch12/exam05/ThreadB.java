package ch12.exam05;

public class ThreadB extends Thread{
	public boolean stop = false;		//초기값을 펄스로 준다
	public boolean work = true;		//초기값을 트루로 준다
	
	@Override
	public void run() {
		while(!stop){
			if(work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				Thread.yield();			//실행 대기상태로 둔다
			}
		}
		System.out.println("ThreadB 종료");
	}
}
