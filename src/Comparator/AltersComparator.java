package Comparator;

import java.util.Comparator;

public class AltersComparator implements Comparator<Birne>{
	
	@Override
	public int compare(Birne o1, Birne o2) {
		
		// compareTo gibt es für Strings und vergleicht alphabetisch
		return o1.compareTo(o2);
	}
	
	
	

}
