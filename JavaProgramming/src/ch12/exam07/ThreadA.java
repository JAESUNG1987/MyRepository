package ch12.exam07;

public class ThreadA extends Thread{
	public boolean stop = false;		//초기값을 펄스로 준다
	public Work work = Work.CONTINUE;		
	
	@Override
	public void run() {
		while(!stop){  //stop -> true
			if(work == Work.CONTINUE) {
				System.out.println("ThreadA 작업 내용");
			} else if (work == Work.PAUAE){
				Thread.yield();			//실행 대기상태로 둔다
			}
		}
		System.out.println("ThreadA 종료");
	}	
}
