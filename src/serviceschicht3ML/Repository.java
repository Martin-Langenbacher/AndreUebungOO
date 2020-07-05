package serviceschicht3ML;

import java.util.List;


//hier: Wie greife ich auf die Database zu (z.B. Grundfunktionen, delete, create, ...)
public class Repository {
	
	private static int schalter = 1;

	public List<Entity> getAll() {
		
		// Database ist der KlassenNamen:
		List<Entity> dataBaseContent = new Database().dataSetInDatabase;
		List<Entity> dataFromMl = new DatabaseMl2().dataSets;
		
		if (schalter == 1) {
			return dataBaseContent;
			
		} else {
			return dataFromMl;
		}
	}
}


