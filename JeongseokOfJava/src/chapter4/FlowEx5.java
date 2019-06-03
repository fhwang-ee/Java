package chapter4;

import java.util.Scanner;

public class FlowEx5 {
	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';
		char subgrade = ' ';
		
		while(true){
			System.out.println("당신의 점수를 입력해주세요");
			Scanner scan = new Scanner(System.in);
			score = scan.nextInt();
			
			
			if(score>=90){
				grade = 'A';
				if(score>=97){
					subgrade = '+';
				}else if(score<94){
					subgrade = '-';
				}
			} else if(score>=80){
				grade = 'B';
				if(score>=87){
					subgrade = '+';
				}else if(score<84){
					subgrade = '-';
				}
			} else{
				grade = 'C'; // 다른 값을 입력한 후 연달아서 입력할 때, 이때 왜 자꾸 subgrade가 붙는 걸까요?
				subgrade = ' ';
			}
			
			System.out.println("당신의 학점은 " + grade + subgrade + "입니다.");	
		} 
		
	}
}
