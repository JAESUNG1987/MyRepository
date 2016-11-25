package ch15.exam05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
	
		//점수찾기
		int firstScore = scores.first();			//제일작은 값찾기
		System.out.println(firstScore);
		System.out.println();
		
		int lastScore = scores.last();				//제일 큰갑 찾기
		System.out.println(lastScore);
		System.out.println();
		
		int lowerScore = scores.lower(95);			//95값의 바로 밑 가장가까운 정수 찾기 (95를포함안함)
		System.out.println(lowerScore);
		System.out.println();
		
		int higherScore = scores.higher(95);		//95값의 바로 위 가장가까운 정수 찾기 (95를포함안함)
		System.out.println(higherScore);
		System.out.println();
		
		int floorScore = scores.floor(95);			//95값의 바로 밑 가장가까운 정수 찾기 (95를포함)
		System.out.println(floorScore);
		System.out.println();
		
		int ceilingScore = scores.ceiling(95);		//95값의 바로 위 가장가까운 정수 찾기 (95를포함)
		System.out.println(ceilingScore);
		System.out.println();
		
		//정렬
		NavigableSet<Integer> descendingSet = scores.descendingSet();			//내앞,뒤를 알아가는 // 내림차순
		for(Integer score : descendingSet) {
			System.out.print(score + ",");
		}
		System.out.println();
	
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();	//어쌘딩 메소드가 없어서 디센딩을 두번씀 올림차순
		for(Integer score : ascendingSet) {
			System.out.print(score + ",");
		}
		System.out.println();
	
		//범위검색
		
		TreeSet<String> words = new TreeSet<>();		//유니코드로 검사 유니코드 번호
		words.add("apple");
		words.add("forever");
		words.add("description");
		words.add("ever");
		words.add("zoo");
		words.add("base");
		words.add("guess");
		words.add("cherry");
		
		NavigableSet<String> ns = words.descendingSet().descendingSet();		//유니코드로 올림차순
		for(String word : ns) {
			System.out.print(word + ",");
		}
		System.out.println();
		
		NavigableSet<String> ns2 = words.subSet("c", true, "f", false);	//앞에거를 포함하면 트투 포함안하면 펄스	
																			//f가 트루여도 forever 랑 f는 다른 문자여서 f는 포함이 안된다 forever이 f로바뀌면 포함된다.
		for(String word : ns2) {
			System.out.print(word + ",");
		}
		System.out.println();
		
	}

}
