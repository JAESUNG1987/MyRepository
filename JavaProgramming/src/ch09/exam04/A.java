package ch09.exam04;

public class A {

	public A(){

		B b = new B();
		
	}
	
	void method(){
		B b = new B();
	}
	
	static void method2(){
		//B b = new B();
	}
	
	public class B {
		
		int field1;
	
		void method1(){}
		
	}

}
