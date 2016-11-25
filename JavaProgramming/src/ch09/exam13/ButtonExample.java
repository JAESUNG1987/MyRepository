package ch09.exam13;

public class ButtonExample {
	public static void main(String[] args){
		Button btnOk = new Button();
		
		final int value = 10; 			//로컬변수를 로컬클래스내에서 사용하면 로컬변수는 파이널 특성을 갖는다.
		
		btnOk.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				
				System.out.println("음악을 " + value + "번 재생합니다.");
				
			}
		});
		
		
		btnOk.click();
		
	}
	
}
	


