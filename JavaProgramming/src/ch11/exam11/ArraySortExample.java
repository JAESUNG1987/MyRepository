package ch11.exam11;

import java.util.Arrays;

public class ArraySortExample {

	public static void main(String[] args) {
		Board[] boardArr = {
			new Board(3, "오늘은 화요일"),
			new Board(1, "다음주는 추석"),
			new Board(5, "과제가 있을까?"),
		};
		
	Arrays.sort(boardArr);		//소트라는 메소드가 내부적으로 타입변환을 하고있다. 
								//Comparable c = board;  컴페러블은비교할수있는 기능을 가지고있다.
	System.out.println(Arrays.toString(boardArr));
	}

}
