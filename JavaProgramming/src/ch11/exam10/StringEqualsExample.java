package ch11.exam10;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("홍길동");
		String strVar2 = "홍길동";			//리터럴(literal) - 코드상에서주는 값

		if(strVar1 == strVar2) {		//참조변수일때는 같은객체냐 물어보는것
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {	//참조변수일때 문자열이 같냐
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}