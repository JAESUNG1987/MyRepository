package ch11.exam13;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		Integer obj =100;	//100이라는 값을 인티저 객체로 만들어 인티저를 박싱하고 obj에 넣는다.
		
		int value = obj;	//래퍼객체 안에있는 100을 
		System.out.println(value);
		
		int result = obj + 200;
		System.out.println(result);
	}

}
