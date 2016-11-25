package ch11.exam10;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";		
		//한글자바를 영어 JAVA로 바꾸고 싶을때
		String newStr = oldStr.replace("자바", "JAVA");		//리플레이스는 oldStr은 그대로 있다.
		
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(oldStr == newStr);
		
	}
}

