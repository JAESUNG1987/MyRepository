package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		
		Reader reader = new InputStreamReader(is);			//아래위 이거은 같은것 이게 쓰기 더 편함
		char data = (char)reader.read();
		System.out.println(data);
		
		/*
		byte[] values = new byte[100];
		int byteNum = -1;
		String data = new String(values,0,byteNum-2);
		System.out.println(data);
		*/
	}

}
