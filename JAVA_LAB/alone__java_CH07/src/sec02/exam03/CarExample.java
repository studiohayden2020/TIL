package sec02.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("replace! FrontLeft tire to HankookTire");
				car.frontLeftTire = new HankookTire("FrontLeft", 15);
				break;
			case 2:
				System.out.println("replace! FronRight tire to HankookTire");
				car.frontRightTire = new HankookTire("FrontRight", 13);
				break;
			case 3:
				System.out.println("replace! BackLeft tire to HankookTire");
				car.backLeftTire = new HankookTire("BackLeft", 14);
				break;
			case 4:
				System.out.println("replace! BackRight tire to HankookTire");
				car.backRightTire = new HankookTire("BackRight", 17);
				break;
			}
			System.out.println("------------------------------------");
		}
	}
}
