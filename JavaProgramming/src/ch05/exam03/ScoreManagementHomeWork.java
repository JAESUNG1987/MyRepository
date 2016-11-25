package ch05.exam03;

import java.util.Scanner;

public class ScoreManagementHomeWork {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] scores = new String[100][];
		scores[0] = null;
		scores[1] = null;
		while(true) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("1.목록 | 2.글쓰기 | 3.상세보기 | 4.수정하기 | 5.삭제하기 | 6.종료 ");
			System.out.println("------------------------------------------------------------------");
			System.out.print("선택: ");
			String choice = scanner.nextLine();
			if ( choice.equals("1")) {
				System.out.println("**************************************************************");
				System.out.println("게시물번호\t\t제목\t\t글쓴이\t\t조회수");
				System.out.println("**************************************************************");
				for(int i=0; i<scores.length;i++) {
					String[] score = scores[i];
					if(score != null) {
						System.out.println(score[0] + "\t\t" + score[1] + "\t\t" + score[2] + "\t\t" +score[3]+ "\t\t" +score[4]);
					}
				}
			} else if ( choice.equals("2")) { 
				System.out.print("제목: ");
				String title = scanner.nextLine();
				System.out.println("글쓴이: ");
				String name = scanner.nextLine();
				System.out.println("조회수: ");
				String count = scanner.nextLine();
				for(int i=0; i<scores.length; i++) {
					if(scores[i] == null) {
						
					}
				}
				
			} else if ( choice.equals("3")) {
				
			} else if ( choice.equals("4")) {
				
			} else if ( choice.equals("5")) {
				
			} else if ( choice.equals("6")) {
				break;
			}
			
		}
		
	}

}
