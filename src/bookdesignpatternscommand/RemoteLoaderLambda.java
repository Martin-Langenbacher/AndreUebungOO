package bookdesignpatternscommand;

public class RemoteLoaderLambda {
	
public static void main(String[] args) {
		
		RemoteControlLambda remoteControlLambda = new RemoteControlLambda();
		 
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan= new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Main house");
		Stereo stereo = new Stereo("Living Room");
		
		
		
		/*
		
		remoteControlLambda.setCommand(0, livingRoomLight::on,  livingRoomLight::off);
		remoteControlLambda.setCommand(1, kitchenLight::on,  kitchenLight::off);
		remoteControlLambda.setCommand(2, ceilingFan::high, ceilingFan::off);
		
		Command stereoOnWithCD = () -> {
			stereo.on(); stereo.setCD(); stereo.setVolume(11);
		};
		
		remoteControlLambda.setCommand(3,  stereoOnWithCD,  stereo::off);
		RemoteControlLambda.setCommand(4, garageDoor::up, garageDoor::down);
		
		
		
		
		
		
		/*
		
 
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		*/
		
		
		
		
		System.out.println(remoteControlLambda);
 
		remoteControlLambda.onButtonWasPushed(0);
		remoteControlLambda.offButtonWasPushed(0);
		remoteControlLambda.onButtonWasPushed(1);
		remoteControlLambda.offButtonWasPushed(1);
		remoteControlLambda.onButtonWasPushed(2);
		remoteControlLambda.offButtonWasPushed(2);
		remoteControlLambda.onButtonWasPushed(3);
		remoteControlLambda.offButtonWasPushed(3);
	}

}
