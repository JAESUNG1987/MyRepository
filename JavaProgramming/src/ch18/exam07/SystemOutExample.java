package ch18.exam07;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("콘솔에 출력합니다.");
		
		OutputStream os = System.out;			//위와 아래는 같다
		String data = "콘솔에 출력합니다.";
		byte[] values = data.getBytes();
		os.write(values);
		os.flush();
		os.close();
		
		System.err.println("콘솔에 출력합니다.");	//에라메세지를 콘솔에서 빨간줄로 출력한다.
		
		
	}

}
