package abstractex;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("Turn On the power");
	}
	public void turnOff() {
		System.out.println("Turn Off the power");
	}
}
