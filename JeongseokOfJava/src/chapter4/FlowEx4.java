package chapter4;

import java.util.Scanner;

public class FlowEx4 {
	public static void main(String[] args){
		
		/* score = �Է��ϴ� ����
		 * grade = ��ȯ�� ����
		 * 
		 * 1. ����ڰ� ������ �Է��Ѵ�
		 * 2. �Է��� ������ 90�̻��̸� A
		 * 80�̻� 90 �̸��̸� B
		 * 70�̻� 80 �̸��̸� C
		 * �������� D
		 * �� ����Ѵ�
		 * 
		 */
		
		int score = 0;
		char grade = ' ';
				
		System.out.println("������ �Է��ϼ��� > ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		
		if(score>=90){
			grade = 'A';
		}else if(score>=80){
			grade = 'B';
		}else if(score>=70){
			grade = 'C';
		}else grade = 'D';
				
		System.out.println("����� ������ " + grade + " �Դϴ�.");
		
	}
}
