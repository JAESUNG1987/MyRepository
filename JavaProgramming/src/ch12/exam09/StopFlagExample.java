package ch12.exam09;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 pt1 = new PrintThread1();
		pt1.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		
		pt1.setStop(true);		//스탑을 트루로 바꿔서 와일문을 빠져나오게한다.
	}

}
