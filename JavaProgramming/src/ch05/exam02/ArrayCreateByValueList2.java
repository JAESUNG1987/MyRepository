package ch05.exam02;

public class ArrayCreateByValueList2 {

	public static void main(String[] args) {
		
		int[] scores = { 83,90,87,95 };
		
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		//System.out.println(scores[3]);
		
		int arrayLength = scores.length;   //length 는 필드 
		System.out.println("배열의 길이는:" + arrayLength);
		
		/*for(int i=0; i<scores.length;i++) {
			int sum=0;
			sum+=scores[i];
			System.out.println(scores[i]);
			
		}
		*/
		int sum = 0;
		for(int i=0; i<scores.length;i++) {
			sum+=scores[i];
			
			
			
		}
		System.out.println("전체 합:" + sum);
		double avg = sum / scores.length;
		System.out.println("평균 값:" + avg + "입니다");
		
		
	}


		
}
	

