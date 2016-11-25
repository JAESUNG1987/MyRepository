package ch13.exam02;

import java.util.Date;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();		
		//뒤<> 안에 타입은 안넣어도 앞에타입으로 들어간다고 간주
		//<> 다이아몬드 연산자
		box1.setItem("홍길동");
		String name = box1.getItem();
		
		Box<Integer> box2 = new Box<>();
		box2.setItem(10);		
		int value = box2.getItem();
		
		Box<Date> box3 = new Box<>();
		box3.setItem(new Date());
		Date now = box3.getItem();
		
		
	}

}
