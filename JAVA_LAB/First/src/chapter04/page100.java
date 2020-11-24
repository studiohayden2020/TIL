package chapter04;

import java.util.Scanner;

public class page100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
	
		int score = sc.nextInt();
		char grade;
		
		if(score >= 90) {
			grade = 'A';
			System.out.println("당신의 점수는 " + grade + " 입니다.");
		}
		else if(score >= 80) {
			grade = 'B';
			System.out.println("당신의 점수는 " + grade + " 입니다.");
		}
		else if(score >= 70) {
			grade = 'C';
			System.out.println("당신의 점수는 " + grade + " 입니다.");
		}
		else if(score >= 60) {
			grade = 'D';
			System.out.println("당신의 점수는 " + grade + " 입니다.");
		}
		else {
			grade = 'F';
			System.out.println("당신의 점수는 " + grade + " 입니다.");
		}
	}

}
