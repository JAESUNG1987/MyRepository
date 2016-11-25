package ch06.exam13;

public class School {
	//Field
	private static School singleton = new School();
	
	
	
	//Constructor
	private School() {
		//private 를 생성자 앞에쓰면 내부에서만 사용할수있다.
	}
	
	
	
	
	//Method
	static School getInstance(){
		return singleton;
	}
	

}
