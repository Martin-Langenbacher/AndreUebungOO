package serviceschicht;

import java.util.List;

public class Service {
	
	// alle Prudukte ausgeben
	public void showAllProducts(){
		
		View view = new ConsoleView();
		//ConsoleView view = new ConsoleView();    // --> Ausgetauscht wegen Interface!
		//PdfView view = new PdfView();
		
		Repository model = new Repository();
		List<Entity> products = model.getAll();    // besorgt alle Infos, die die View benötigt
		view.printProducts(products);              // hier werden die products weitergeleitet
		
	}

}







/*

Ideen - hier mehr methoden
und ich will nicht in jeder methode eine neues ViewModel objekt / und repository objectd anlegen
Lösung: Instanzvariable
und Konstructor genau sagen ... ==> Dependance Injection (mit Annotation...) --> mit Config-datei Austauschen...
Singleton...
Spring macht model-View controller !!!

*/





