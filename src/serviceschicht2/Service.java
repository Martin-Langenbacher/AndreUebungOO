package serviceschicht2;


public class Service {

	public void showAllProducts() {
		
		ViewInterface view = new CommandLineView();
		
		
		
	}

}


/*
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

*/