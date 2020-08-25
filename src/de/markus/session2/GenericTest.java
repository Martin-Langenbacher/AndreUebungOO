package de.markus.session2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		
		List<String> items = Arrays.asList("Martin", "Bert", "Yeti", "Andi", "Markus", "Harald", "Li", "Ines-Langname");
		
		Collections.sort(items, new GenericsStandardComparator<String>());
		System.out.println(items);
	}

}

// String extends comparable NOT Comparator !
// CTRL Shift O
