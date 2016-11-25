package ch06.exam07;

public class BoardExample {

	public static void main(String[] args) {
		Board b1 =new Board(3);
		System.out.println("b1.no: " + b1.no);
		Board b2 =new Board(1, "제목");
		Board b3 =new Board("제목", 1);
		
		
	}

}
