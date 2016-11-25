package ch12.exam03;

public class MainThreadExample {
	public static void main(String[] args) {
		//공유객체 생성
		Calculator calculator = new Calculator();
		
		//스레드객체 생성
		User1 user1 = new User1();
		User2 user2 = new User2();
		
		//공유객체 각 스레드에게 주입
		user1.setClaculator(calculator);
		user2.setClaculator(calculator);
		
		//스레드 실행
		user1.start();
		user2.start();
	}
}
