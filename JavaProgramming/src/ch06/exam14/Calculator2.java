package ch06.exam14;

public class Calculator2 {
	//Field
	final int field2;  //final은 최종적을 의미하는데 final을 쓰면 값을 바꿀수가없다.  final을 선언한것은 선언할떄 값을 주어야한다.
						//필드내에서 값을 안주면 인스턴스필드는 생성자에서 한번 스태틱필드는 스태틱블록에서 값을 주어야한다.
						// 필드내에서 값을 주면 생성자나 스태틱필드에서 값을 줄수없다.
	static final int Field4;
	
	//Constructor
	Calculator2() {
		field2 = 5;
	}
	
	static {
		Field4 = 5;
	}
	//Method
	
	
	
	
}
