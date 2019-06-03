package chapter4;

import java.util.Scanner;

public class FlowEx4 {
	public static void main(String[] args){
		
		/* score = 입력하는 점수
		 * grade = 반환할 학점
		 * 
		 * 1. 사용자가 점수를 입력한다
		 * 2. 입력한 점수가 90이상이면 A
		 * 80이상 90 미만이면 B
		 * 70이상 80 미만이면 C
		 * 나머지는 D
		 * 를 출력한다
		 * 
		 */
		
		int score = 0;
		char grade = ' ';
				
		System.out.println("점수를 입력하세요 > ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		
		if(score>=90){
			grade = 'A';
		}else if(score>=80){
			grade = 'B';
		}else if(score>=70){
			grade = 'C';
		}else grade = 'D';
				
		System.out.println("당신의 학점은 " + grade + " 입니다.");
		
	}
}
