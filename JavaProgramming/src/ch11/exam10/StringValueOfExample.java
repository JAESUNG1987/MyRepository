package ch11.exam10;

public class StringValueOfExample {

	public static void main(String[] args) {
		String str1 = "" + 10;			//문자열 10이 만들어져서 대입이된다
		String str2 = String.valueOf(10);		//이것을 더많이 쓴다.
		
		int value = Integer.parseInt(str2);
		

	}

}
