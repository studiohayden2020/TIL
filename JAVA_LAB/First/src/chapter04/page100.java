package chapter04;

import java.util.Scanner;

public class page100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
	
		int score = sc.nextInt();
		char grade;
		
		if(score >= 90) {
			grade = 'A';
			System.out.println("����� ������ " + grade + " �Դϴ�.");
		}
		else if(score >= 80) {
			grade = 'B';
			System.out.println("����� ������ " + grade + " �Դϴ�.");
		}
		else if(score >= 70) {
			grade = 'C';
			System.out.println("����� ������ " + grade + " �Դϴ�.");
		}
		else if(score >= 60) {
			grade = 'D';
			System.out.println("����� ������ " + grade + " �Դϴ�.");
		}
		else {
			grade = 'F';
			System.out.println("����� ������ " + grade + " �Դϴ�.");
		}
	}

}
