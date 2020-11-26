import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;

import javax.swing.JOptionPane;

public class OkJavaGoInHomeInput {
	
	// parameter, 매개변수
	public static void main(String[] args) {
		
		String id = args[0];
		// String id;
		// id = JOptionPane.showInputDialog("Enter your Room Number");
		
		String bright = args[1];
		// String bright;
		// bright = JOptionPane.showInputDialog("Enter a mood lamp's level");
		
		// Elevator call 
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id +" hallLamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id +" floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}
	
}
