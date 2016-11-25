package ch11.exam01;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member){			//멤버객체인지 검사
			Member target = (Member)obj;
			if(id.equals(target.id)){
				return true;
			}
		}
		return false;
	}
	
}
