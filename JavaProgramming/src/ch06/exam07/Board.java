package ch06.exam07;

public class Board {
	//Field
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	//ConstructorOverloading  //생성자가 여러게있는것을 생성자오버로딩 이라한다.
	//1. 매게 변수의 수가 달라야한다
	//2. 매게변수의 타입일 달라야한다.
	//매게변수의 수가 같아도 매게변수의 타입이 같으면 오버로딩이된다.
	//객체 생성방법을 다르게하기위해 오버로딩한다.
	Board() {}
	
	Board(int no) {
		//int a =10;  
		this(no, null, null, null, 0); //this 가 제일 첫줄에 들어와야한다.
		int b =10;
	}
	
	Board(int no, String title) {
		this(no, title, null, null, 0);
	}
	
	Board(String title, int no) {
		this(no, title, null, null, 0);
	}
	
	Board(int no, String title, String content) {
		this(no, title, content, null, 0);
	}
	
	Board(int no, String title, String content, String writer) {
		this(no, title, content, writer, 0);
	}
	
	Board(int no, String title, String content, String writer, int hitcount) {
		
	}
	
	
	
	//Method
	
	
}
