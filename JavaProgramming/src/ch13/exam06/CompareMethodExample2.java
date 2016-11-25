package ch13.exam06;

public class CompareMethodExample2 {

	public static void main(String[] args) {
		Pair<String,String> p1 = new Pair<String,String>("name","홍길동");
		Pair<String,String> p2 = new Pair<String,String>("name","김가을");
		boolean result = Util.compare(p1, p2);
		System.out.println(result);
		/*
		Pair<String,Integer> p3 = new Pair<String,Integer>("name",10);
		Pair<String,Integer> p4 = new Pair<String,Integer>("name",30);
		boolean result2 = Util.max(p3, p4);
		System.out.println(result2);
		*/
	}

}
