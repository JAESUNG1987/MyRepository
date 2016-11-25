package ch06.exam17;

public class Member { //특별하지않는이상 private
	private String mid;
	private String mname;
	private String mpassword;
	private int mage;
	private boolean madult;
	private double mheight;
	
	public Member(String mid) {
		this.mid = mid;
	}
	
	public String getMid() { //게터메소드는 필드값을 외부로 리턴
		return mid;
	}
	
	public void setMheight(double mheight) { //세터메소드는
		if(mheight<0.0) {
			mheight = 0.0;
		}
		this.mheight = mheight;
	}
	
}
