package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();		//뉴툴킷으로 안만들고 정적메소드로 작성
		
		Thread thread = new Thread(){	//스레드를 상속해서 받는것
			
			@Override
			public void run() {
				for(int i =0; i<5; i++){
					toolkit.beep();
					System.out.println("소리:" +Thread.currentThread().getName());
					try {Thread.sleep(500); } catch (Exception e){}		
					
				}
				
			}
		};
		thread.setName("SoundThread");		//셋네임으로 스레드 이름을 바꿀수잇다.//스타트 하기전에 스레드 이름을 바꿔야한다.
		thread.start();
		
		for(int i =0; i<5; i++){
			System.out.println("띵");
			System.out.println("출력:" +Thread.currentThread().getName());
			try {Thread.sleep(500); } catch (Exception e){}		
			
		}

	}

}
