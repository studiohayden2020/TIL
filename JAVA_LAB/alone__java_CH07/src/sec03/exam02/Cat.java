package sec03.exam02;

public class Cat extends Animal {
	public Cat() {
		this.kind = "Mammalia";
	}
	
	@Override
	public void sound() {
		System.out.println("meow");
	}
}
