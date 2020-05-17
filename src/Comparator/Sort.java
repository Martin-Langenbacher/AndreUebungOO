package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
	
	public static void main(String[] args) {
		
		Item[] items = new Item[] {new Item("Foo", 3), new Item("Bar", 5)};
		
		Comparator<Item> cn = new ItemComparatorByName();
		Comparator<Item> ca	= new ItemComparatorByAge();
		
		Arrays.sort(items, cn);
		System.out.println("Sort by Name: ");
		System.out.println(Arrays.toString(items));
		
		Arrays.sort(items, ca);
		System.out.println("Sort by Age: ");
		System.out.println(Arrays.toString(items));
		
	}

}
