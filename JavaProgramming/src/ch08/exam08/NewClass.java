package ch08.exam08;

public class NewClass implements OracleInterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		OracleInterface.super.method2();
	}

}
