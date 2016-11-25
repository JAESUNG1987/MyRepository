package ch09.exam05;

public class Example {

	public static void main(String[] args) {
		A.B.fild2 = 10;
		A.B.method2();
		//A.B b = new A.B(); //B라는 클래스의 이름이니까 가능한데 B의 멤버로 이동할때는 안된다.
		A.B b = new A.B();
		
		b.field1 = 10;
		b.method1();

	}

}
