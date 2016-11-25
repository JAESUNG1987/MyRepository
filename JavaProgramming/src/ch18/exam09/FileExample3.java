package ch18.exam09;

import java.io.File;
import java.io.IOException;

public class FileExample3 {

	public static void main(String[] args) throws IOException {
		
		File root = new File("C:/");	
		File[] contents = root.listFiles();
		
		for(File file : contents){
			if(file.isDirectory()){
				System.out.print(" <DIR> ");
			} else {
				System.out.println("\t");
				System.out.println(file.length());		//파일크기 조사
			}
			System.out.print("\t");
			System.out.println(file.getName());
		}
	}

}
