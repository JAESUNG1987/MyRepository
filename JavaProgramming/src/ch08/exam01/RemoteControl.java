package ch08.exam01;

public interface RemoteControl {
	//상수//Constant
	int MAX_VOLUME = 10;  //앞에 public static final 이있다고 생각하면된다. //상수는 대문자가 관례 두가지이상의 단어가 결압되면 _로이어짐
	int MIN_VOLUME = 1;
	
	//추상메소드//Abstract Method
	void turnOn();	//앞에 public abstract 이있다고 생각하면 된다
	void turnOff();
	void setVolume(int Volume);
	
	//디폴트메소드//Default Method      
	default void setMute(boolean mute){
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해지합니다.");
		}
	}
	
	//정적메소드//Static Method
	static void changeBattery(){
		System.out.println("건전지를 교환합니다.");
	}
	
}
