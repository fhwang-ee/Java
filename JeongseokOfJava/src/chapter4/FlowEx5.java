package chapter4;

import java.util.Scanner;

public class FlowEx5 {
	public static void main(String[] args) {
		
		int score = 0;
		char grade = ' ';
		char subgrade = ' ';
		
		while(true){
			System.out.println("����� ������ �Է����ּ���");
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
				grade = 'C'; // �ٸ� ���� �Է��� �� ���޾Ƽ� �Է��� ��, �̶� �� �ڲ� subgrade�� �ٴ� �ɱ��?
				subgrade = ' ';
			}
			
			System.out.println("����� ������ " + grade + subgrade + "�Դϴ�.");	
		} 
		
	}
}
