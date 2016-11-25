package ch06.example;

public class MemberService {
	String name;
	String password;
	
	boolean login(String id, String password){
		if(id.equals("hong") && password.equals("12345")){
			return true;
		}else {
			return false;
		}		
	}
	
	void logout(String id){
		System.out.println("로그아웃 되었습니다.");
	}

}
