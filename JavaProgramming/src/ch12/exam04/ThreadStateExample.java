package ch12.exam04;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());	//생성자의 매게값으로 객첼ㄹ주는거
		statePrintThread.start();
	}
}

