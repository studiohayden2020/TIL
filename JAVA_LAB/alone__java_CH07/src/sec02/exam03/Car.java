package sec02.exam03;

public class Car {
	// field
	Tire frontLeftTire = new Tire("FrontLeft", 6);
	Tire frontRightTire = new Tire("FrontRight", 2);
	Tire backLeftTire = new Tire("BackLeft", 3);
	Tire backRightTire = new Tire("BackRight", 4);
	// constructor
	// method
	int run() {
		System.out.println("[your car is moving]");
		if((frontLeftTire.roll()==false) ) { stop(); return 1;}
		if((frontRightTire.roll()==false) ) { stop(); return 1;}
		if((backLeftTire.roll()==false) ) { stop(); return 1;}
		if((backRightTire.roll()==false) ) { stop(); return 1;}
		return 0;
	}
	
	void stop() {
		System.out.println("[your car is going to stop]");
	}
}
