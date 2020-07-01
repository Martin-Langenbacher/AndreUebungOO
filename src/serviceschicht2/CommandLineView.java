package serviceschicht2;

import java.util.List;

import serviceschicht2.Entity;
import serviceschicht2.ViewInterface;

public class CommandLineView implements ViewInterface {

	public void printProducts(List<Entity> products) {
		
		for (Entity object : products) {
			System.out.print("Sein Vorname ist " +object.getVorname());
			System.out.print(", und der Nachname ist " +object.getNachname());
			System.out.println(" " +object.getVorname() +" ist " +object.getAlter() + " Jahre alt.");
			
		}
	}
}



//-->> Generics eingeführt, weil wir die Entitys benutzen wollen und nicht casten wollen!
// -->> List<Entity>

