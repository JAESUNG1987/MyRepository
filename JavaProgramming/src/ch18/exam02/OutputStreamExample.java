package ch18.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("src/ch18/exam02/data1.txt");	//어떤파일에 출력할지 경로 넣어주기
		String data = "abcdefghij";
		byte[] values = data.getBytes();
		for(int i=0; i<values.length; i++){
			os.write(values[i]);
		}
		os.flush();
		os.close();
		
		//위와 아래 둘다 같은것을 출력하지만 아래께 더 좋음
		os = new FileOutputStream("src/ch18/exam02/data2.txt");	//어떤파일에 출력할지 경로 넣어주기
		data = "abcdefghij";
		values = data.getBytes();
		os.write(values);
		os.flush();
		os.close();
	}

}
