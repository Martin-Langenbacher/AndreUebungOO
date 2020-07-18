package bookdesignpatternscommand;

public class Light {
	
	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on");
	}

	public void off() {
		System.out.println(location + " light is off");
	}

}



/*package bookdesignpatternscommand;

public class Light {

	public Light(String string) {
		// TODO Auto-generated constructor stub
	}

	public void on() {
		System.out.println("Light is on");
	}

	public void off() {
		System.out.println("Light is off");
	}

}
*/
