package ch07.exam09;

public class Car {
	//필드
	Tire[] t = { 
		new Tire("앞왼쪽", 6),
		new Tire("앞오른쪽", 2),
		new Tire("뒤왼쪽", 3),
		new Tire("뒤오른쪽", 4)
	};
	/*Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);*/
	
	//생성자
		
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		for(int i=0;i<t.length;i++){
			if(t[i].roll()==false)
				stop();
			return (i+1);
		}
			
	
		/*if(t[0].roll()==false) { stop(); return 1; };
		if(t[1].roll()==false) { stop(); return 2; };
		if(t[2].roll()==false) { stop(); return 3; };
		if(t[3].roll()==false) { stop(); return 4; };*/
		return 0;
}
		
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}




