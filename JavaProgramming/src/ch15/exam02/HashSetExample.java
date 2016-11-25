package ch15.exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//Set 계열 컬렉션 생성
		Set<String> set = new HashSet<>();
		
		//객체 저장			//set은 중복저장을 허용안함.
		set.add("Java");
		set.add("JDBC");
		set.add("Servet/JSP");
		set.add("Java");
		set.add("iBATIS");
		System.out.println(set.size());
		System.out.println();
		
		//객체를 일괄처리
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			if(str.equals("JDBC")){
				iterator.remove();
			}
			System.out.println(str);
		}
		System.out.println();
		
		for(String str : set){
			System.out.println(str);
			/*if(str.equals("JDBC")){		//set은 4번을 돌기로했는데 리무브를 해서 하나를 지우면 4번째 돌때 에러가난다.
				set.remove(str);
			}*/
		}
		System.out.println();
	}

}
