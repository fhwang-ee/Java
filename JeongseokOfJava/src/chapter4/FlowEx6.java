package chapter4;

import java.util.Scanner;

public class FlowEx6 {
	public static void main(String[] args) {
		System.out.print("���� ���� �Է��ϼ��� : ");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month){
			case 3 :
			case 4 :
			case 5 :
				System.out.println("���Դϴ�");
				break;
			
			case 6 :
			case 7 :
			case 8 :
				System.out.println("�����Դϴ�");
				break;
				
			default :
				System.out.println("3���� 8�� ���� �Է����ּ���");
		}
		
	}
}
