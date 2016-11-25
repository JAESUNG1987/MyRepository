package ch05.exam01;

public class ValueReferenceCompare {
	public static void main(String[] args) {
		//값비교
		int v1 = 100;
		int v2 = 100;
		System.out.println(v1==v2);
		System.out.println(v1!=v2);
		
		//참조 비교(객체비교)
		String r1 = new String("자바");
		String r2 = new String("자바");
		System.out.println(r1==r2);
		System.out.println(r1!=r2);
		
		String r3 = "자바";
		String r4 = "자바";
		System.out.println(r3==r4);
		System.out.println(r4!=r3);
		
		//r1 과 r2는 같은객채를 사용하느냐
	}
	
}
