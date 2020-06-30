package serviceschicht;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	// statische Variable
	List<Entity> dataSets = new ArrayList<Entity>();
	
	public Database() {
		
		dataSets.add(new Entity("André", "K.", 33));
		dataSets.add(new Entity("Markus", "S.", 34));
		dataSets.add(new Entity("Martin", "L.", 46));
		dataSets.add(new Entity("Isabel", "L.", 6));
		dataSets.add(new Entity("Kai", "L.", 33));
	}

}
