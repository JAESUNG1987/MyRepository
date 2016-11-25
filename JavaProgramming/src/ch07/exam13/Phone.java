package ch07.exam13;

public abstract class Phone {  //중복되는 부분만 모아둔 클래스
	public String number;
	
	
	public abstract void ring();	//추상메소드는 존재는 하는데 내용은 모를때 사용
	
	public void sendVoice(){
		System.out.println("음성을 전송합니다.");
	}
	
	public void receiveVoice(){
		System.out.println("음성을 수신합니다.");
	}

}
