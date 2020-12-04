package sec01.exam23;

public class AboutBoxingUnBoxingExample {
	public static void main(String[] args) {
		//Automatic Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//Automatic unBoxing when input
		int value = obj;
		System.out.println("value: " + value);
		
		//Automatic unBoxing when operating
		int result = obj + 100;
		System.out.println("result: " + result);
		
	}
}
