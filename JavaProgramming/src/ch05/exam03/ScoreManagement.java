package ch05.exam03;

import java.util.Scanner;  //스캐너는 자바유틸 패키지에 있는 클래스에 있기에 스캐너를 사용하려면 불러와야한다.

public class ScoreManagement {
	public static void main(String[] args) throws Exception {  // 예외?
		Scanner scanner = new Scanner(System.in); //키보드로부터 읽게끔 스캐너객체를 만들고 스캐너타입 스캐너변수에 대입
		String[][] students = null;   //2차원배열 String타입 students 변수를 선언하고 초기값을 대입해준다. //참조하는 객체의 번지가없다
		while(true) {   // while문을 무한 반복시킨다.
			System.out.println("------------------------------------------------------------------------");
			if(students == null) {  //조건식 students에 해당하는 객체를 못찾앗다면 
				System.out.println("1.총학생수 | 7.종료");  //조건식이 true가되어 이메뉴를 출력한다.
			} else {        //조건식이 해당하는 객채를 찾았다면 false가 되어 아래메뉴를 출력한다.
				System.out.println("1.총학생수 | 2.목록 | 3.입력 | 4.삭제 | 5.최고점수 | 6.평균 | 7.종료");
			}
			System.out.println("------------------------------------------------------------------------");
			System.out.print("선택: ");   //개행을 하지않고 "선택:"을 출력
			String choice = scanner.nextLine();  //string 타입 choice변수에 키보드로 부터 입력받는것을 대입한다.
			if( choice.equals("1") ) {   // 1번읍 입력하면
				System.out.print("총학생수: ");   //개행을 하지않고 "총학생수:"를 출력
				int totalNum = Integer.parseInt(scanner.nextLine());   //총학생수 tottalNum에  키보드에 입력한 문자를 인트타입으로 바꾼후 대입해준다.
				students = new String[totalNum][]; //students 변수에 새로운 String[총항생수][] 배열을 대입한다. 
			} else if( choice.equals("2") ) {         // 2번을 입력하면
				System.out.println("*********************************************");
				System.out.println("학번\t\t이름\t\t점수");  //\t 는 탭만큼 이동
				System.out.println("*********************************************");
				for(int i=0; i<students.length; i++) {         // 학생수의 배열의 길이만큼 반복한다.
					String[] student = students[i];		   //  Sting타입 배열 student 값에 학생수의 배열의 길이를 대입한다.
					if(student != null) {		//student 배열의 항목 이 널이아닐경우 // student에 배열값이 저장이되어있다면
						System.out.println(student[0] + "\t\t" + student[1] + "\t\t" + student[2]);  //student객체의 0인덱스 에 탭탭 만큼이동후 1인덱스 탭탭 이동후 2인덱스를 출력한다.
					}
				}
			} else if( choice.equals("3") ) {			//3번을 입력하면
				System.out.print("이름: ");			//개행을 하지않고 "이름:"을 출력
				String name = scanner.nextLine();	//string 타입 name변수에 키보드로 부터 입력받는것을 대입한다.
				System.out.print("점수: ");			//개행을 하지않고 "점수:"를 출력
				String score = scanner.nextLine();	//string 타입 score변수에 키보드로 부터 입력받는것을 대입한다.
				for(int i=0; i<students.length; i++) {   // 학생수의 배열의 길이만큼 반복한다.
					if(students[i] == null) {		//학생수의 배열의 길이값이 널이 된경우 // 학생수의 배열의값이 저장되어있지않다면
						String[] student = { String.valueOf(i), name, score };		//Sting 배열 student변수에 배열 { 학생수를 스트링갑으로 바꾼수를 저장 , 이름에 넣은 값을 저장 , 점수에 넣은값을 저장 } 
						students[i] = student;			// 학생수의 길이가 
						break;
					}
				}
		
			} else if( choice.equals("4") ) {			//4번을 입력하면 
				System.out.println("삭제할 학번:");
				int sno = Integer.parseInt(scanner.nextLine());   //키보드에 입력하는 문자열값을 숫자로 변환해주며 sno(학번)에 대입한다.
				students[sno] = null;		
		
			} else if( choice.equals("5") ) {   //5번을 입력하면
				int max =0;				//최고점수가 될 max변수를 선언
				for(String[]student : students) {
					if (student != null) {
						int score = Integer.parseInt(student[2]);
						if( max < score) {
							max = score;
						}
					}
				}
				
				System.out.println("*********************************************");
				System.out.println("학번\t\t이름\t\t점수");
				System.out.println("*********************************************");
				
				for(String[]student : students) {
					if (student != null) {
						int score = Integer.parseInt(student[2]);
						if(max == score) {
							System.out.println(student[0] + "\t\t" + student[1] + "\t\t" + student[2]);
						}
					}
				}
				
			} else if( choice.equals("6") ) {    //6번을 입력하면
				int count =0;				// 
				int sum = 0;				// 점수의 총합인 sum변수를 초기값으로 선언
				for(String[]student : students) {   
					if(student != null) {     //student 배열의 항목 이 널이아닐경우 // student객체가 저장이되어있다면
						count ++;				//
						sum += Integer.parseInt(student[2]);		
					}
				}
				System.out.println("평점:" + (double)sum/count);    //"평점:" + 총합 sum을 실수인 더블로 변환시키고 총합 sum에 카운트된수만큼 나눈후 출력시킨다.
			} else if( choice.equals("7") ) {          // 7번을 입력하면
				break;		//while문 반복을 종료한다.
			} 
		}
	}
}
