package ch13.exam05;

public class Util {
	public static <T> Box<T> boxing(T t){		//맨앞 <T> 는 클래스 아니고 타입파라맨타라고 인식하라고 해주는것
												//앞으로 제네릭타입으로 T를 쓰겟다. 
												//선언할떄는 T해도 되지만 사용할때는 구체적인 타입을 써야한다
		Box<T> box = new Box<T>();
		box.setItem(t);
		return box;
	}
}
