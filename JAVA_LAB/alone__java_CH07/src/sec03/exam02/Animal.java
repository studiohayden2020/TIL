package sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("it is breathing");
	}
	
	public abstract void sound();
}
