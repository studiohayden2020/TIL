package sec03.exam02;

public class Dog extends Animal{
	public Dog() {
		this.kind = "Mammalia";
	}
	
	// 재정의 == Override
	@Override
	public void sound() {
		System.out.println("bark bark");
	}
}
