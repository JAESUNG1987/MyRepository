package ch04.exam02;

public class ForExample {

	public static void main(String[] args) { 
		int sum = 0;
		for(int i=0;i<3;i++) {
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			sum += num;
					
		}
		System.out.println("눈의 합:" + sum);
		double avg = sum / 3.0;
		System.out.println("눈의 평균:" + avg);
		
	}

}
