package sec02.exam01;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// use Anony... object field
		anony.field.wake();
		// use object local variable
		anony.method1();
		// use object parameter
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다.");
				}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
				}
			}
		);
	}
}