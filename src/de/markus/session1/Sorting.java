package de.markus.session1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Markus:
// https://gist.github.com/MrSnyder/3879258721193d28e52d31f240f87e58

// Oracle:
// https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html

public class Sorting {

	public String text = "Sorter";

	public static void main(String[] args) {
		List<String> items = Arrays.asList("Martin", "Bert", "Yeti", "Andi", "Markus", "Harald", "Li", "Ines-Langname");
		System.out.println("Before: " + items);
		// sort is a static method of class Collections

		// "normal" class
		Collections.sort(items, new StandardComparator());
		System.out.print("After: " + items);
		System.out.println(" ==> Alphabetische Reihenfolge: ");

		// static inner class
		Collections.sort(items, new InnerComparator1());
		System.out.println("===============>>>-----> Weitere Sorts dazwischen, die nicht ausgegeben werden !!! <-----<<<===============");
		
		// non-static inner class (this is not allowed in static methods!!!)
		// Collections.sort(items, new InnerComparator2());

		// anonymous class
		// how to spot it:
		// new TypeName () { ... }
		//  ^     ^            ^
		//  a     b            c
		// a: new must be present
		// b: usually the name of an Interface
		// c: has an implementation block
		//
		// advantage: briefest way
		// disadvantage: can not be re-used
		// disadvantage: has no describing name
		Collections.sort(items, new Comparator<String> () {				// --> here is the anonymous class !				
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() > s2.length()) {
					return 1;
				}
				if (s1.length() < s2.length()) {
					return -1;
				}
				return 0;
			}
		});
		
		// lambda (variant 1)
		Collections.sort(items, (String s1, String s2) -> {
			if (s1.length() > s2.length()) {
				return 1;
			}
			if (s1.length() < s2.length()) {
				return -1;
			}
			return 0;
		});
		
		// lambda (variant 2)
		Collections.sort(items, (s1, s2) -> {
			if (s1.length() > s2.length()) {
				return 1;
			}
			if (s1.length() < s2.length()) {
				return -1;
			}
			return 0;
		});
		
		// lambda (variant 3)
		Collections.sort(items, (s1, s2) -> s1.length() - s2.length());
		
		// equivalent anonymous class
		Collections.sort(items, new Comparator<String> () {					
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		System.out.print("After: " + items);
		System.out.println("==> Nach Länge sortiert !!!");
	}

	public void doSomething() {
		List<String> items = Arrays.asList("Martin", "Bert", "Yeti", "Andi", "Markus", "Harald");
		Collections.sort(items, new InnerComparator2());
	}

	public static class InnerComparator1 implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			if (s1.length() > s2.length()) {
				return 1;
			}
			if (s1.length() < s2.length()) {
				return -1;
			}
			return 0;
		}
	}

	// a non-static inner class instance has a reference to the enclosing instance
	public class InnerComparator2 implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			if (s1.length() > s2.length()) {
				return 1;
			}
			if (s1.length() < s2.length()) {
				return -1;
			}
			return 0;
		}
	}
}



// java doc collectons: In Collection die methode sort.