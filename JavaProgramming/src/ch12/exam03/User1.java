package ch12.exam03;

public class User1 extends Thread{
	private Calculator claculator;
	
	public void setClaculator(Calculator claculator) {
		this.claculator = claculator;
		setName("User1");
	}


	@Override
	public void run() {
		claculator.setMemory(100);
	}
}
