package serviceschicht;

import java.util.List;

public class PdfView implements View {
	
	
		// die Vorschrift ist, dass ich die Methode "printProducts" nenne; renderPrint geht nicht !!!
		public void printProducts(List<Entity> products) {
			
			for (Entity object : products) {
				System.out.println("Der Vorname ist " +object.getVorname());
			}
				
		}
	
}

