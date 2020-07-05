package serviceschicht3ML;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	// statische Variable
	List<Entity> dataSetInDatabase = new ArrayList<Entity>();
	
	public Database() {
		dataSetInDatabase.add(new Entity("Karl", "Münchhausen", 45));
		dataSetInDatabase.add(new Entity("Kay", "May", 3));
		dataSetInDatabase.add(new Entity("Papa", "Maty", 33));
	}
}

