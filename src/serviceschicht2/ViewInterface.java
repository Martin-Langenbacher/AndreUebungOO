package serviceschicht2;

import java.util.List;
import serviceschicht2.Entity;

public interface ViewInterface {
	
	// für alle View-Klassen: Vorschriften, wie es heißen muss!
		public void printProducts(List<Entity> products);
}

