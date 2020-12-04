package sec01.exam08;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		
		Class clazz = Car.class;
		
//		// 두 번째 방법
//		Class calzz = Class.forName("sec01.exam08.Car");
		
//		// 세 번째 방법
//		Car car = new Car();
//		Class clazz = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}
}
