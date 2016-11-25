package ch12.exam03;

public class User2 extends Thread{
	private Calculator claculator;
	
	public void setClaculator(Calculator claculator) {
		this.claculator = claculator;
		setName("User2");
	}


	@Override
	public void run() {
		claculator.setMemory(50);
	}
}
