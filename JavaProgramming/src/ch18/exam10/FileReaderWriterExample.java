package ch18.exam10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/ch18/exam10/NAVER.html");		//뭘복사할지 모르니 원래는 input output stream 을 써야한다.
		FileWriter fw = new FileWriter("src/ch18/exam10/NAVER2.html");		
		
		char[] values = new char[1024];
		int charNum = -1;
		while((charNum = fr.read(values)) != -1){
			fw.write(values,0,charNum);
		}
			fw.flush();
			fr.close();
			fw.close();
		
	}
}
