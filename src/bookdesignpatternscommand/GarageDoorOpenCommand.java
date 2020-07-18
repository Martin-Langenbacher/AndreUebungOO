package bookdesignpatternscommand;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	
	public void execute() {
		garageDoor.up();
	}


	@Override
	public void undo() {
		garageDoor.down();
	}

}


/*
Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	

	public void execute() {
		light.on();
	}
*/