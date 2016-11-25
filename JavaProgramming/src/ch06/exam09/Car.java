package ch06.exam09;

public class Car {
	//Field
	int gas;
	
	//Constructo
	
	//Method
	void setGas(int gas){
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}else {
			System.out.println("gas가 있습니다.");
			return true;
			
		}
	}
	
	
	void run() {
		while(true) {
			if(gas>0){
				System.out.println("멈춥니다.(gas 잔량:" + gas + ")");
				gas -=1; //gas--1; 와같다.
			}else {
				System.out.println("멈춥니다.(gas 잔량:" + gas + ")");
				
				//break;   // 브레이크를 하게되면 와일문을 빠져나온다.
				return;   //값을 지정하면 에러  void는 리턴값이 없기때문에.   //리턴은 바로 종료
			}
		}
	}
}
