package serviceschicht3ML;

import java.util.List;

import serviceschicht3ML.Entity;
import serviceschicht3ML.ViewInterface;

public class PrintLineView implements ViewInterface {

	@Override
	public void printEntityObjects(List<Entity> entityObjects) {
		
		for (Entity entity : entityObjects) {
			System.out.print("Sein Vorname ist " +entity.getFirstname());
			System.out.print(", und der Nachname ist " +entity.getLastname() +".");
			System.out.println(" " +entity.getFirstname() +" ist " +entity.getAge() + " Jahre alt.");	
		}
	}
}

//-->> Generics eingeführt, weil wir die Entitys benutzen wollen und nicht casten wollen!
//-->> List<Entity>


