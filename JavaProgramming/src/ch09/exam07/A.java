package ch09.exam07;

public class A {
	int field;
	
	public void method(){
		
		class B{
			int filed;
			B(){
				field = 20;
				this.filed = 30;
				A.this.field = 40;
			}
		}
		B b = new B();
		
		System.out.println("B의 필드:" + b.filed);
		System.out.println("A의 필드:" + field);
	}
	
}
