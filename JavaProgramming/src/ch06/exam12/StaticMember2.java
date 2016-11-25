package ch06.exam12;

public class StaticMember2 {
	//StaticField
	static String field;
	String field2;
	
	
	//StaticConstructor
	static {
		System.out.println("Static Block 실행");
		field = "자바";
		//field2 = "자바";
	}
	//정적자의 초기화는 스태틱블록에서 초기화한다.
	
	//StaticMethod
	static void method(){
		//field2 = "자바";
	}
	void method2(){	
		field = "자바";
		field2 = "자바";
	}
	
	public static void main(String[] args) {
		field = "자바";
		//field2 = "자바";
		
		method();
		//method2();
		
		StaticMember2 sm = new StaticMember2();
		sm.field2 = "자바";
		sm.method2();
		
	}
	
}
