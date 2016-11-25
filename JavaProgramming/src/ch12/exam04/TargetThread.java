package ch12.exam04;

public class TargetThread extends Thread {	
	public void run() {
		for(long i=0; i<1000000000; i++) {}			//RUN과 RUNABLE 을 왔다 갔다 하는 상태	//실제 러너블 상태가 리턴
		
		try {
			//1.5초간 일시 정지
			Thread.sleep(1500);
		} catch(Exception e) {}
		
		for(long i=0; i<1000000000; i++) {}
	}
}

