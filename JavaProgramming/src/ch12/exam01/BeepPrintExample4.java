package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample4 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();		//뉴툴킷으로 안만들고 정적메소드로 작성
		
		Thread thread = new SoundThread();		
		thread.start();			//스타트가 실행되면 사운드스레드에 있는 메소드 런이 실행된다.
		
		for(int i =0; i<5; i++){
			System.out.println("띵");
			System.out.println("출력:" +Thread.currentThread().getName());
			try {Thread.sleep(500); } catch (Exception e){}		
			
		}

	}

}
