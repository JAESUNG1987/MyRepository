package ch08.exam04;

public class CarExample1 {

	public static void main(String[] args) {
		Car1 myCar = new Car1();
		
		myCar.run();
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}
}
