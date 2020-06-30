package serviceschicht;

import java.util.List;

public class ConsoleView implements View{

	//public void printProducts(List products) {
	public void printProducts(List<Entity> products) {
		
		// for (Object object : products) {
		for (Entity object : products) {
			System.out.print("Der Vorname ist " +object.getVorname());
			System.out.print(", und der Nachname ist " +object.getNachname());
			System.out.println(" " +object.getVorname() +" ist " +object.getAlter() + " Jahre alt.");
			
			//System.out.println("Der Vorname ist " +((Entity)object).getVorname());
		}
	}
}



//-->> Generics eingeführt, weil wir die Entitys benutzen wollen und nicht casten wollen!
