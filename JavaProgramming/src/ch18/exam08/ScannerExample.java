package ch18.exam08;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scanner1.nextLine();		//엔터키까지 다읽고 엔터키전의 것만 읽는다.
		
		System.out.print("나이: ");
		int age = scanner1.nextInt();		//넥스트인트는 엔터를 읽지않는다. 
		
		System.out.print("키: ");
		double height = scanner1.nextDouble();		//넥스트더블은 엔터를 읽지않는다. 
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
	}

}
