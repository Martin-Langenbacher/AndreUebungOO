package bookdesignpatternscommand;

public class GarageDoor {
	
	String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + " garage Door is Up");
	}

	public void down() {
		System.out.println(location + " garage Door is Down");
	}

	public void stop() {
		System.out.println(location + " garage Door is Stopped");
	}

	public void lightOn() {
		System.out.println(location + " garage light is on");
	}

	public void lightOff() {
		System.out.println(location + " garage light is off");
	}

}



/* Übung 1 <<<===================================================================
package bookdesignpatternscommand;

public class GarageDoor {
	
	public void up() {
		System.out.println("Garage door is open");
	}
	
	public void down() {
		System.out.println("Garage door is closed");
	}

}
*/