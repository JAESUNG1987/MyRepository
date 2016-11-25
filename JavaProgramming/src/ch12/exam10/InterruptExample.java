package ch12.exam10;

public class InterruptExample {

	public static void main(String[] args) {
		PrintThread3 pt1 = new PrintThread3();
		pt1.start();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		
		pt1.interrupt();	//스레드가 잠시 일시정지가 될때 예외를 발생시켜 와일문을 빠져나오게한다.
	}

}
