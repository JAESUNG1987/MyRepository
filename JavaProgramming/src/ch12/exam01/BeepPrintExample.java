package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();		//뉴툴킷으로 안만들고 정적메소드로 작성
		
		for(int i =0; i<5; i++){
			toolkit.beep();
			//System.out.println(Thread.currentThread().getName());		//스레드 클래스의 정적메소드 커런트스레드 		//메인스레드의 이름이 나온다
			Thread.sleep(500);		//스레드를 0.5초동안 쉬었다가 돌아라
			
		}
		
		
		
		for(int i =0; i<5; i++){
			System.out.println("띵");
			//System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);		
			
		}

	}

}
