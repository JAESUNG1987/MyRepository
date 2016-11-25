package ch06.example;

public class ShopService {
	
	private static ShopService singleton = new ShopService();
	
	private ShopService(){
		
	}
	
	public static ShopService getInstance(){
		return singleton;
	}

}
