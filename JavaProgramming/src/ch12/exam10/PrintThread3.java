package ch12.exam10;

public class PrintThread3 extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("실행 중...");
			//if(isInterrupted()){		//인스턴스 메소드	//외부에서 인터럭티드를 한번이라도 
										//출력했냐 안했냐 한번이라도 했으으면 트루로 빠져나온다
			if(Thread.interrupted()){	//정적 메소드
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
