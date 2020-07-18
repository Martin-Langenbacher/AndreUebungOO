package bookdesignpatternscommand;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light("Test 1 - Light");
		GarageDoor garageDoor = new GarageDoor("Test 1 - Garage-Door!");
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}

}
