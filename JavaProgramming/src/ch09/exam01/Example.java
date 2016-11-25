package ch09.exam01;

public class Example {

	public static void main(String[] args) {
		A a = new A();
		//A.B b = new A.B(); //B라는 클래스의 이름이니까 가능한데 B의 멤버로 이동할때는 안된다.
		A.B b = a.new B();
		
		b.field1 = 10;
		b.method1();

	}

}
