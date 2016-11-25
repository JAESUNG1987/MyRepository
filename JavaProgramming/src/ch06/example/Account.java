package ch06.example;

public class Account {
	int balance;
	final int MIN = 0;
	final int MAX = 1000000;

	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int bal) {
		if(MIN<bal && bal<MAX){
			balance = bal;
		} 
	}
	
	
}
