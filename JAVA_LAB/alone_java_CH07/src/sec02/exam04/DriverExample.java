package sec02.exam04;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Driver d = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle vehicle = new Vehicle();
		
		driver.drive(bus);
		driver.drive(taxi);
		d.drive(vehicle);
		
	}
}
