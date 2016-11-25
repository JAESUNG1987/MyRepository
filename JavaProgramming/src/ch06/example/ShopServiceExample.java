package ch06.example;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService o1 = ShopService.getInstance();
		ShopService o2 = ShopService.getInstance();
		
		if(o1==o2){
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}

	}

}
