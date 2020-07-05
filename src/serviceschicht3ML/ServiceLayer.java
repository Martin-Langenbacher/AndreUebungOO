package serviceschicht3ML;

import java.util.List;

public class ServiceLayer {

	public void showAllEntityObjects() {
		
		ViewInterface view = new PrintLineView();  		// erstellt view, der später ausgedruckt (==> printEntityObjects) werden soll: PrintLineView(), vom Interface: ViewInterface
		Repository model = new Repository();       		// --> ruft Repository auf ==> und holt durch getAll alle Daten!
		List<Entity> entityObjects = model.getAll();	// ==> durch den getAll-Aufruf werden alle Daten an entityObjects angehängt!
		view.printEntityObjects(entityObjects);			// ++> Hier wird nun alles ausgedruckt: der VIEW !!!
		System.out.println();
		System.out.println("Im ServiceLayer, zweiter Aufruf, dieses Mal von 'ProntOnlyAgeView'!  =====>>>");
		ViewInterface viewOnlyAge = new PrintOnlyAgeView();
		viewOnlyAge.printEntityObjects(entityObjects);
	}
}


