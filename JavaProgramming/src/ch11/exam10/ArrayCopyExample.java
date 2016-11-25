package ch11.exam10;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V','A'};
		
		//배열 복사 방법1							//배열을 만들고 카피
		char[] arr2 = new char[arr1.length];
		for(int i=0; i<arr1.length; i++){
			arr2[i] = arr1[i];		//값만 저장해서 얕은 복사
		}
		System.out.println(Arrays.toString(arr2));
	
		//배열 복사 방법2							//배열을 만들고 카피
		char[] arr3 = new char[arr1.length];		//얕은복사
		System.arraycopy(arr1, 0, arr3, 0 , arr1.length);		//배열복사기능 어레이카피	
		System.out.println(Arrays.toString(arr3));
		
		//배열 복사 방법3							//배열을 안만들고 카피
		char[] arr4 = Arrays.copyOf(arr1, arr1.length);		//복사방법2와3은 알아두어야한다.	//얕은복사
		System.out.println(Arrays.toString(arr4));				
	}

}
