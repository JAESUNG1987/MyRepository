package ch08.exam02;

public class Audio implements RemoteControl{  //오디오는 리모트콘트롤 인터페이스를 사용가능하구나

	@Override  //인터페이스에서 설명한 내용대로 제대로 작성이되었는지 컴파일러가 확인하는작업
	public void turnOn() {
		System.out.println("Audio 를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 를 끕니다");
		
	}

	@Override
	public void setVolume(int Volume) {
		System.out.println("현재 Audio 볼륨:" + Volume);
		
	}

}
