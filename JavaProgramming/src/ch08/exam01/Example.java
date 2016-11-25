package ch08.exam01;

public class Example {
	public static void powerOn(RemoteControl rc){
		rc.turnOn();
	}

	public static void main(String[] args) {
		int max = RemoteControl.MAX_VOLUME;
		int min = RemoteControl.MIN_VOLUME;
		
		//RemoteControl.turnOn();			//추상메소드는 현재 객체가없어서 실행이안된다.
		//RemoteControl.turnOff();
		//RemoteControl.setVolume(RemoteControl.MAX_VOLUME);
		
		//RemoteControl.setMute(true);		//디폴트메소드는 현재 객체가없어서 실행이안된다.

		
		RemoteControl.changeBattery();
		
		//----------------------------------------------
		Television tv = new Television();
		tv.turnOn();
		
		RemoteControl rc = tv;
		rc.turnOn();
		
		Audio audio = new Audio();
		audio.turnOn();
		rc=audio;
		rc.turnOn();
		
		//----------------------------------------------
		
		powerOn(new Television());
		powerOn(new Audio());

	}

}
