package ch11.exam10;

import java.util.StringTokenizer;

public class StringSplitStringTokenizer {

	public static void main(String[] args) {
		String data = "홍길동,이수홍,박연수,감자바,최명호";		//토큰들이라 부른다. 쉼표사이 이름
		
		String[] dataArray = data.split(",");
		System.out.println(dataArray.length);
		for(String name : dataArray){
			System.out.println(name);
		}
		
		StringTokenizer st = new StringTokenizer(data,",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){			//해즈모어토큰을 쓰면 넥스트토큰을 같이 써야한다.
			String name = st.nextToken();
			System.out.println(name);
		
		}
		
		
		data = "홍길동&이수홍,박연수,감자바-최명호";		
		
		dataArray= data.split("&|,|-");
		System.out.println(dataArray.length);
		for(String name : dataArray){
			System.out.println(name);
		}
	}

}
