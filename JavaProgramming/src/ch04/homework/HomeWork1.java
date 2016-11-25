package ch04.homework;

public class HomeWork1 {

	public static void main(String[] args) { 
		
		for(int i=1; i<=100; i++) {								//i는 1에서 100까지 반복하며 대입한다. 
			int num1 =(int)(Math.random()*6)+1;				//1에서 6까지의 임의의 수를 num1에 대입
			int num2 =(int)(Math.random()*6)+1;				//1에서 6까지의 임의의 수를 num2에 대입
			if(num1 + num2 ==10) {								// 조건식이 true면
				System.out.println("("+num1+","+num2+")");		// (num1,num2)를 출력한다.
			}		
		}
	}
}
