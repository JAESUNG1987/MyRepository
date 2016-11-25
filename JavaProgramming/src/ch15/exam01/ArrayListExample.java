package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//List 계열의 컬랙션 생성
		List<String> list = new ArrayList<>();		//어레이리스트 자리에 백터,링크드리스드 가들어와도 상관없다. 다만 성능이 다르다.
		
		//객체저장
		list.add("자바");
		list.add("JDBC");
		list.add("Setvlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		
		//저장된 객체수 얻기
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		//객체 찾기
		String skill = list.get(2);
		System.out.println("2:" + skill);
		
		//전체객체를 일괄 처리
		for(int i=0; i<list.size(); i++){
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		for(String str : list){		//list자리에는 이터러블을 구현한 객체만 올수있다,
			System.out.println(str);
		}
		System.out.println();
		
		//객체 삭제
		list.remove(2);			//리무브를 하면 배열객체가 없어지고 배열은 당겨진다.
		list.remove(2);
		list.remove("iBatis");		
		System.out.println(list.size());
	}

}
