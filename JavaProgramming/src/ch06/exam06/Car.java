package ch06.exam06;

public class Car {

	//Field
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	//Constructor
	Car(){
		
	}
	
	Car(String model) {
		this.model=model;
	}
	
	Car(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	Car(String model, String color , int maxspeed) {
		this.model=model;
		this.color=color;
		this.maxspeed=maxspeed;
	}
	
	//Method
	
}
