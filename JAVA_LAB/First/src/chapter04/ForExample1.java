package chapter04;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum;
		for(i = 1, sum = 0; i <= 10; i = i+1) {
			sum = sum + i;
		}
		
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
	}

}
