package ch08.exam02;

public class Television implements RemoteControl{
	
	private int Volume;

	@Override  //인터페이스에서 설명한 내용대로 제대로 작성이되었는지 컴파일러가 확인하는작업
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int Volume) {
		if(Volume>RemoteControl.MAX_VOLUME){
			this.Volume = RemoteControl.MAX_VOLUME;
		} else if(Volume<RemoteControl.MIN_VOLUME){
			this.Volume=RemoteControl.MIN_VOLUME;
		} else {
			this.Volume = Volume;
		}
		System.out.println("현재 TV 볼륨:" + Volume);
		
	}

}
