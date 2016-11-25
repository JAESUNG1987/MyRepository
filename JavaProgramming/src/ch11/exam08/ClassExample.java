package ch11.exam08;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class classCar  = Car.class;								//이게 가장쉬운방법 //로딩이 되있는걸 찾아옴
		//Class classCar = Class.forName("ch11.exam08.Car");		//try catch가 넣는게 맞지만 예외처리를 떠넘김 //로딩이 안되있어도 찾아온다.데이터베이스올릴때 자주사용
		Car car = new Car();										//이 세가지 방법이 골고루 쓰인다.		
		Class classCar = car.getClass();
		
		System.out.println(classCar.getName());
		System.out.println(classCar.getSimpleName());
		System.out.println(classCar.getPackage().getName()); 
		
		
	}

}
