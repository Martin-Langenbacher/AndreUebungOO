package serviceschicht;

import java.util.List;

public interface View {
	
	// für alle View-Klassen: Vorschriften, wie es heißen muss!
	public void printProducts(List<Entity> products);
	
}
