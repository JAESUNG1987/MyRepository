package ch12.exam08;

public class ThreadB extends Thread{
	private WorkObject workObject;		//외부에서 받아서 넣는게 주입
	
	
	public ThreadB(WorkObject workObject){		//생성자 주입
		this.workObject = workObject;		
	}
	
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			workObject.mehtodB();
		}
	}
}
