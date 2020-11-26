package sec02.exam03;

public class KumhoTire extends Tire {
	//field
	//constructor
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		}
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
		System.out.println(location + " HankookTire lifetime: "
				+ (maxRotation-accumulatedRotation) + "times");
		return true;
		} else {
		System.out.println("*** " + location + " HankookTire punk ***");
		return false;
	
		}
	}

}
