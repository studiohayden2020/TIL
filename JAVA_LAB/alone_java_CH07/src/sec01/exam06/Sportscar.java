package sec01.exam06;

public class Sportscar extends Car {
	@Override
	public void speedUp() { speed += 10; }

	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
