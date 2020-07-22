package bookdesignpatternstemplate2;

import java.util.Comparator;

public final class MartinDuckNameComparator implements Comparator<MartinDuck> {
	
	public int compare(final MartinDuck martinDuck1, final MartinDuck martinDuck2) {
		
		return martinDuck1.getName().compareTo(martinDuck2.getName());
	}

}
