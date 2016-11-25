package ch06.homework;

public class MessageBoard {
	
	//Field
	int no;
	String title;
	String text;
	String name;
	int count;
	
	//Constructor
	MessageBoard(){}
	MessageBoard(int no, String title,String text, String name){
		this.no = no;
		this.title = title;
		this.text = text;
		this.name = name;
	}
	MessageBoard( String title,String text, String name, int count){
		this.title = title;
		this.text = text;
		this.name = name;
		this.count = count;
	}
	MessageBoard(int no, String title,String text, String name, int count){
		this.no = no;
		this.title = title;
		this.text = text;
		this.name = name;
		this.count = count;
	}
	
	
	//Method
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
