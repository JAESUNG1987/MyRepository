package ch12.exam08;

public class WorkObject {
	public synchronized void mehtodA(){
		System.out.println("ThreadA 의 methodA() 작업실행");
		notify();
		try { wait(); } catch (InterruptedException e) {}
	}
	
	public synchronized void mehtodB(){
		System.out.println("ThreadB 의 methodB() 작업실행");
		notify();
		try { wait(); } catch (InterruptedException e) {}
	}
}
