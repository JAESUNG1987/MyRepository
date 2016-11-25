package ch08.exam07;

public class Driver {
	//Field		//필드
	
	//Constructor	//생성자
	
	//Method	//메소드
	public void drive(Vehicle vehicle){
		if(vehicle instanceof Bus){
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		}
		vehicle.run();
		
	}

}
