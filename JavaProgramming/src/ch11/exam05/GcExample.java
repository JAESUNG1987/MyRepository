package ch11.exam05;

public class GcExample {

	public static void main(String[] args) {
		Employee emp = new Employee(1);
		emp = null;			//Employee의 객체를 번지를 모르게된고 Employee객체를 사용할수없다.
		emp = new Employee(2);
		emp = new Employee(3);
		System.gc();		//쓰레기객체를 제거해라.//시스템이 메모리가 부족하다고 판단될때 나 한가할때 그때 처리한다.
		
	}

}
