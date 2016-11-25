package ch11.exam04;

public class ExitExample {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager(){	 //익명객체를 만들어 제공해준다.//시큐리티매니저를 셋팅하겟다
			@Override
			public void checkExit(int status){			
				if(status != 5){		
					throw new SecurityException();
				}
				System.out.println("나 죽내~");
			}
						
		});
		
		for(int i=0;i<10;i++){
			System.out.println(i);		//시스템을 종료 //번호에 따라서 프로세스를 멈추게할수도 멈추게안할수도 있다.
			try{
			System.exit(i);			//i는 종료 상태번호
			} catch (SecurityException e) {}
		}

	}		//서버프로그램
	

}
