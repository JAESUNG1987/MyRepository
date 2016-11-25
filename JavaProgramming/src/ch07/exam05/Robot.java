package ch07.exam05;

public class Robot extends Machine{
	
	@Override
	public void work() {
		System.out.println("Robot-work()실행" );
		super.work();

	}
	/*   //파이널이라 재정의 안됨
	public final void powerOn(){
		
	}
	*/
	
}
