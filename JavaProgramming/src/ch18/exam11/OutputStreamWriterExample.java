package ch18.exam11;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		String data = "가";
		/*
		byte[] values = data.getBytes();
		for(int i=0; i<values.length; i++){
			os.write(values[i]);
			
		}
		os.flush();
		*/
		
		Writer writer = new OutputStreamWriter(os);		//위와 같은 결과값을 나오게하지만 아래게 더 효율적임
		writer.write(data);
		writer.flush();
	}

}
