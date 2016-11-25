package ch15.exam07;

import java.util.Stack;

public class StackExmaple {
	public static void main(String[] args) {
		
		Stack<Coin> stack = new Stack<>();
		
		stack.push(new Coin(100));		//코인넣기
		stack.push(new Coin(500));
		stack.push(new Coin(50));
		
		while(!stack.isEmpty()) {		//스택이 비어있지않으면
			Coin coin = stack.pop();	//코인빼기
			System.out.println(coin.getValue()+ "원");
		}
		
	}

}
