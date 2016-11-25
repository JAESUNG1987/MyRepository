package ch06.exam16.pack1;

public class A {
	//Field
	private int field1;		//개인적인, 이곳에서만 사용가능
	int field2;  //같은 패키지에서만 사용가능
	public int field3;		//공개의미 모든곳에서 사용가능
	
	//ConStructor
	
	private A() {}
	A(int field1) {}
	public A(int field1, int field2) {}
	
	//Method
	
	private void method1(){}
	void method2(){}
	public void method3(){}
}
