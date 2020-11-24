package classpart;

public class FunctionTest3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");
		
		int sum1 = minus(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + sum1 + "입니다");
		
		float sum2 = division(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + sum2 + "입니다");
	}

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
		
	}
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static float division(float n1, float n2) {
		float result = n1 / n2;
		return result;
	}
}
