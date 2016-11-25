package ch18.exam08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("src/ch18/exam08/data.txt");
		Scanner scanner1 = new Scanner(is);	//스캐너에는 인풋스트림의 자식 객체가 들어올수 있다.
		

		String name = scanner1.nextLine();		
		int age = Integer.parseInt(scanner1.nextLine());		
		double height = Double.parseDouble(scanner1.nextLine());		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
	}

}
