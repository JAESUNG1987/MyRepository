package ch04.exam02;

public class WhileExample5 {

	public static void main(String[] args)throws Exception {
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if(keycode != 13 && keycode != 10) {
				System.out.println("----------------------");
				System.out.println("1.증속 |2.감소 |3.멈춤");
				System.out.println("----------------------");
				System.out.print("선택:");
			}
			
			keycode = System.in.read();	
		
			if(keycode ==49) {
				
				speed ++;
				System.out.println("현재속도:" + speed);
			} else if(keycode ==50) {
				speed --;
				System.out.println("현재속도:" + speed);
				
			} else if(keycode ==51) {
				run = false;
			}
		}

	}

}
