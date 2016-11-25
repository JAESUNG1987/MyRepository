package ch06.exam07;

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
		this(model,"빨강",200);
	}
	
	Car(String model, String color) {
		this(model,color,200);
	}
	
	Car(String model, String color , int maxspeed) {
		this.model=model;
		this.color=color;
		this.maxspeed=maxspeed;
	}
	
	//Method
	
}
