package de.markus.session2;

import java.util.Comparator;

public class GenericsStandardComparator <T extends Comparable<T>> implements Comparator<T>{
	
	public int compare(T s1, T s2) {
		return s1.compareTo(s2);
	}
}

// comparable ist ein Interface, dass vergleichbar ist --> compareTo()
// comparator ist ein "Vergleicher" --> compare()