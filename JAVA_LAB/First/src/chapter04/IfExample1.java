package chapter04;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		
		int age = 0;
		int sc_age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է� �ϼ���: ");
		age = sc.nextInt();
		
		if(age >= 8); {
			System.out.println(age+"�ʵ��б��� �ٴϰ� �־��");
			sc.close();
		}
		
		else if(age > 9); {
			System.out.println("�ʵ��л� �ƴ�");
		}
		
	}

}
