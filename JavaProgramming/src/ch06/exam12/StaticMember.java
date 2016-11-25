package ch06.exam12;

public class StaticMember {
	//StaticField
	static String field;
	//StaticConstructor
	
	StaticMember(){
		System.out.println("생성자 실행");
	}
	static {
		System.out.println("Static Block 실행");
		field = "자바";
	}
	//정적자의 초기화는 스태틱블록에서 초기화한다.
	
	//StaticMethod
	static void method(){
		
	}
	
	
}
