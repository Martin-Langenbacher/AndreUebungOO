package serviceschicht2;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	// statische Variable
	List<Entity> dataSets = new ArrayList<Entity>();

	public Database() {
		dataSets.add(new Entity("Otto", "Walker", 77));
		dataSets.add(new Entity("Anne", "Pfannenhuber", 37));
		dataSets.add(new Entity("Berta", "Bertaline", 57));
		dataSets.add(new Entity("Emil", "Detektive", 14));
		dataSets.add(new Entity("Thomas", "Schauvorbei", 44));
	}

}



