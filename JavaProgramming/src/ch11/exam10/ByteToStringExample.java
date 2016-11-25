package ch11.exam10;

import java.io.UnsupportedEncodingException;

public class ByteToStringExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97};		//ASCII번호 
		
		String str1 = new String(bytes);
		System.out.println(str1);		//시스템이라는 클래스가있는데 이안에 아웃이라는 정적필드가 있다.,
		
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		//--------------------------------------------------------------
		
		String str3 = "홍길동";
		byte[] strBytes3 = str3.getBytes();
		String str4 = new String(strBytes3);
		System.out.println(str4);
		
		String str5 = "ab홍길동";
		byte[] strBytes5 = str5.getBytes("UTF-8");				//인코딩 //인코딩 문자셋과 디코딩 문자셋은 같아야한다.
		String str6 = new String(strBytes5, "UTF-8");			//디코딩 //문자셋이 어떠냐에 따라 바이트크기가 다름
		System.out.println(str6);
		String str7 = new String(strBytes5, 2,9,"UTF-8");
		System.out.println(str7);
	
		
	}

}
