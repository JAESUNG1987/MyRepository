package ch18.exam15;

import java.io.Serializable;

public class Member implements Serializable{		//Serializable 를 구현할때 uid를 명시적으로 넣어주면 좋다,
	
	private static final long serialVersionUID = -7614355132400340926L;		
	private String mid;
	private String mname;
	private static String nation = "한국";
	private transient String mpassword;
	private int mage;
	private String job;

	
	public static String getNation() {
		return nation;
	}
	public static void setNation(String nation) {
		Member.nation = nation;
	}

	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public int getMage() {
		return mage;
	}
	public void setMage(int mage) {
		this.mage = mage;
	}
	
	public Member(String mid, String mname, String mpassword, int mage) {
		this.mid = mid;
		this.mname = mname;
		this.mpassword = mpassword;
		this.mage = mage;
	}
}
