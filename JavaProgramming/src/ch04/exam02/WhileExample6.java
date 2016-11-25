package ch04.exam02;

public class WhileExample6 {

	public static void main(String[] args) throws Exception{
		boolean run = true;
		int sum = 0;
		int keycode =0;
		
		while(run) {
			if(keycode != 13 && keycode != 10) {
				System.out.println("----------------------");
				System.out.println("1.예금 |2.출금 |3.종료");
				System.out.println("----------------------");
				System.out.print("선택:");
			}
			
			keycode = System.in.read();
		
			if(keycode ==49) {
			
				sum +=1000;
				System.out.println("현재잔액:" + sum);
			} else if(keycode ==50) {
				sum -=500;
				System.out.println("현재잔액:" + sum);
			 		
			} else if(keycode ==51) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
