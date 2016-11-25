package ch11.exam10;

import java.util.Arrays;

public class ArraySortExample {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		
		Arrays.sort(scores);			//올림차순 정렬을 하고싶을때 
		System.out.println(Arrays.toString(scores));
		
		Member2[] members = {
				new Member2("홍길동", 99),
				new Member2("박동수", 97),
				new Member2("김민수", 98),
				
				
		};
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}

}

class Member2 implements Comparable{		//컴플리먼츠가 가지고있는 것을 멤버에서 재정의해야한다.	//컴플리먼트를 구현하고 컴페어투를 재정의 그다음에 위에 소트 멤버를 비교할수있다.
	String name;
	int score;
	Member2(String name, int score){
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Object o) {		//컴페어투 는 비교할때쓰는 메소드 , 소트라는 메소드에서 컴페어투를 가지고 크고작으냐 비교
											//int가 음수 값을 리턴하면 멤버2가 더작은것이다., 0 이나오면 같은값 양수가나오면 멤버투가 오브젝토다 큰것
									
		Member2 target = (Member2)o;
		//return name.compareTo(target.name);		//사전순으로 이름을 먼저나오게 하고싶을때
		return score-target.score;					//점수낮은사람순으로 나오게 하고싶을때  
		//return target.name.compareTo(name);		//홍길동을 먼저나오게하려면 타겟네임이랑 네임의 위치를 바꾸면 댄다.
	}
	
	@Override
		public String toString() {
			
			return name;
		}
	
}