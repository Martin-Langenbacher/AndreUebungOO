package serviceschicht2;

import java.util.List;


//hier: Wie greife ich auf die Database zu (z.B. Grundfunktionen, delete, create, ...)
public class Repository {
	
	public List<Entity> getAll() {
		
		List<Entity> dataBaseContent = new Database().dataSets;
		
		return dataBaseContent;
	}
}



