package serviceschicht;

import java.util.List;

// hier: Wie greife ich auf die Database zu (z.B. Grundfunktionen, delete, create, ...)
public class Repository {

	public List<Entity> getAll() {
		
		// alles muss aus der Datenbank geholt werden:
		return new Database().dataSets;
	}

}
