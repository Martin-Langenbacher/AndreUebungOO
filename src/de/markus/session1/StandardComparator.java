package de.markus.session1;

import java.util.Comparator;

public class StandardComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
		
	}

	
		
		/*
		if (s1.length() > s2.length()) {
			return 1;
		}
		if (s1.length() < s2.length()) {
			return -1;
		}
		return 0;
	} */

}
