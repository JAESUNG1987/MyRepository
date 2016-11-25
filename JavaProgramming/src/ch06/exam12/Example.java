package ch06.exam12;

public class Example {

	public static void main(String[] args) {
		//Instance Member 사용
		InstanceMember im = new InstanceMember();
		System.out.println(im.field);
		im.method();
		
		
		StaticMember a = new StaticMember();
		//Static Member 사용  //사용되거나 실행 될때 적재 되서 
		System.out.println(StaticMember.field);
		StaticMember.method();

	}

}
