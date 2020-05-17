package Comparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		
		List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("Foo", 3));
		items.add(new Item("Bar", 5));
		items.add(new Item("Martin", 4));
		items.add(new Item("André", 10));
		
		Iterator<Item> iter = items.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		
		// dies geht nur, weil List eine iterator-Methode hat !!!
		for (Item i : items) {
			System.out.println(i);
		}

	}

}
