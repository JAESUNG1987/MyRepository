package ch11.exam10;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";		
		
		boolean result1 = subject.contains("자바");
		if(result1){
			System.out.println("자바 관련 책이군요.");
		} else {
			System.out.println("자바 관련 없는 책이군요.");
		}
		
		int result2 = subject.indexOf("자바");
		if(result2 != -1){					//없으면 -1이 리턴된다. 이유는 없고 그냥 만들엇다. 약속.
			System.out.println("자바 관련 책이군요.");
		} else {
			System.out.println("자바 관련 없는 책이군요.");
		}
		int startIndex = subject.indexOf("자바");
		int endIndex = startIndex + 2;
		String token1 = subject.substring(startIndex , endIndex);		//토큰은 잘라내느거	//(x,x) 첫번째는 어디에서부터 
																		//자를지의 인덱스번호 두번쨰는 어디까지 자를거냐
																		//endindex는 포함하지 않아서
		System.out.println(token1);
		
		String find = "프로그래밍";
		startIndex = subject.indexOf(find);
		//endIndex = startIndex + find.length();						//어떤위치에서 부터 시작까지 끝을 알고있으면
		//String token2 = subject.substring(startIndex , endIndex);
		String token2 = subject.substring(startIndex);			//어떤위치에서 부터 끝까지 나오게하려면
		System.out.println(token2);
		

	}
}

