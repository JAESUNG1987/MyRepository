package ch15.homework.exam8;

public class Student {
	public int bno;
	public String bname;
	
	public Student(int bno, String bname) {
		this.bno = bno;
		this.bname = bname;
	}
	
	@Override
	public int hashCode() {
		return bno;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;		
		Student student = (Student) obj;
		if(bno != student.bno) return false;
		return true;
	}
}
