package Comparator;

import java.util.Comparator;

public class ObstComparator implements Comparator<Obst>{

	@Override
	public int compare(Obst o1, Obst o2) {
		
		// aufsteigend
		return o1.getName().compareTo(o2.getName());
		
		// absteigend
		//return o2.getName().compareTo(o1.getName());
	}
	
	
	

}
