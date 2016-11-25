package ch07.exam02;

public class DmbCellphone extends CellPhone{
	//Field
	int channel;
	
	
	//Constructor
	public DmbCellphone(String model,String color,int channel){
		super(model,color);					//부모생성자를 말한다. 
		//super.model = model;				//super는 위에 부모를 가르키는 키워드다. //자식클래스위체에서만 쓸수잇다.//생성자나 인스턴스메소드에서만 쓸수잇다.
		//this.color = color;				//this는 자기자시능ㄹ 가르키는 키워드다. 
		this.channel = channel;
		
	}
	
	
	//Method
		void turnOnDmb() {
			System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
		}	
		void changeChannelDmb(int channel) {
			this.channel = channel;
			System.out.println("채널 " + channel + "번으로 바꿉니다.");
		}
		void turnOffDmb() {
			System.out.println("DMB 방송 수신을 멈춥니다.");
		}	
	}
