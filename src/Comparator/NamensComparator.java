package Comparator;

import java.util.Comparator;

public class NamensComparator implements Comparator<Birne>{

	@Override
	public int compare(Birne o1, Birne o2) {
	// alt: --->  public int compare(Birne o1, Birne o2) {
		// compareTo gibt es für Strings und vergleicht alphabetisch: Hier werden also Zeichenketten verglichen!
		return o1.getName().compareTo(o2.getName());
	}

}
