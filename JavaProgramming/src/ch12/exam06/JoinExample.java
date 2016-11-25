package ch12.exam06;

public class JoinExample {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();		//출력되기전에 실행대기 상태에 있을수도 잇다.
		
		try {st.join();} catch (InterruptedException e) {}	//스레드의 실행종료를 기다림
		
		System.out.println("1~100 합:" + st.getSum());
	}

}
