package ch11.exam10;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);    //매게값을 안줬을때에는 하나의키 한바이트만 읽는다 매게값에 
													//리드는 읽은바이트수를 리턴

		String str = new String(bytes, 0, readByteNo-2);   //-2를 하는경우는 엔터키를 빼기위해서
		System.out.println(str);
	}
}

