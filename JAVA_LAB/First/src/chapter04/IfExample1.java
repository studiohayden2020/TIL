package chapter04;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		
		int age = 0;
		int sc_age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력 하세요: ");
		age = sc.nextInt();
		
		if(age >= 8); {
			System.out.println(age+"초등학교에 다니고 있어요");
			sc.close();
		}
		
		else if(age > 9); {
			System.out.println("초등학생 아님");
		}
		
	}

}
