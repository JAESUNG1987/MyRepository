package ch15.exam01;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Jdbc", "Database");		//리스트를 구현한객체이지만 배열을 만들어 관리
		System.out.println(list.size());
		for(String str : list){
			System.out.println(str);
		}
		
		//list.add("SQL"); (x)
		//list.remove(1);  (x)
	}

}
