package sec03.exam01;

public abstract class Phone {
	// field
	public String owner;
	
	// constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// method
	public void turnOn() {
		System.out.println("Turn on power");
	}
	public void turnOff() {
		System.out.println("Turn off power");
	}
}
