package ch06.exam03;

public class Car {

	//Field		//객체 안에들어감
	String company = "현대자동차";
	
	//Constructor    //객체를 만들때만 사용 //생성자
	Car() {
		System.out.println("Car()실행됨");
		//Integer.parseInt("a");
	}
	
	//Method		//객체 안에들어감
	void run(){	
		System.out.println("run()실행됨");
	}
	
}
