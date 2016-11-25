package ch18.exam07;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {
	public static void main(String[] args) throws IOException {
		//한개의 키만 읽기
		InputStream is = System.in;
		/*
		System.out.print("키 하나만 입력: ");
		int keyCode = is.read();
		System.out.println(keyCode + ":" + (char)keyCode);
		*/
		//한글과 같은 여러키의 조합을 읽기
		System.out.print("여러키를 입력: ");
		byte[] values = new byte[100];
		int byteNum = is.read(values);		//만약 abcdefghij 를 입력하고 엔터를 쳤다면 12를 리턴 엔터는 13과 10이 포함
		String data = new String(values,0,byteNum-2);		//엔터를 빼기위해 -2를 함 
		System.out.println(data);
	}
	
}
