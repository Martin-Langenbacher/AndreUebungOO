package serviceschicht2;

import java.util.List;

import serviceschicht2.CommandLineView;
import serviceschicht2.Entity;
import serviceschicht2.Repository;
import serviceschicht2.ViewInterface;

public class Service {

	public void showAllProducts() {
		
		ViewInterface view = new CommandLineView();  // --> ruft view auf (hier CommandLineView, vom Interface: ViewInterface): ==> PrintProduts
		Repository model = new Repository();         // --> ruft Repository auf ==> und holt durch getAll alle Daten!
		List<Entity> products = model.getAll();
		//List<serviceschicht.Entity> products = model.getAll();
		view.printProducts(products);
	}
}

