package ch11.exam12;

import java.util.Arrays;

public class ArraySearchExample {
	public static void main(String[] args) {
		int[] scores = { 99, 97 ,98 };
		Arrays.sort(scores);		//소트를 하고나서 99가 인덱스 끝으로 넘어간다.	//소트를안하면 바이러니서치를 쓸수없다.
		int index = Arrays.binarySearch(scores, 99);		//첫번째는 배열,두번째는 찾고자하는 값
		System.out.println("찾은 인덱스:" + index);
		
		String[] names = { "홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");		//첫번째는 배열,두번째는 찾고자하는 값
		System.out.println("찾은 인덱스:" + index);
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = {m1,m2,m3};
		
		Arrays.sort(members);
		index = Arrays.binarySearch(members,m1);
		System.out.println("찾은 인덱스:" + index);
		
	}

}
