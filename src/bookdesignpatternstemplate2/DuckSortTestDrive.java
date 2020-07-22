package bookdesignpatternstemplate2;

import java.util.Arrays;

public class DuckSortTestDrive {

	public static void main(String[] args) {
		
		Duck[] ducks = { 
				new Duck("Daffy", 8), 
				new Duck("Dewey", 2),
				new Duck("Howard", 7),
				new Duck("Louie", 2),
				new Duck("Martin", 9),
				new Duck("MaDi", 2),
				new Duck("Donald", 10), 
				new Duck("Huey", 2)
				};
		
		
		//Duck[] ducks2 = ducks.clone();
		int amount = 8;
		Duck[] ducks2 = new Duck[amount];
		for (int i = 0; i < amount; i++) {
			ducks2[i] = ducks[i];
		}
		
		
			
		
		System.out.println("Before sorting:");
		display(ducks);
		
		Arrays.sort(ducks);
		
		System.out.println("\nAfter sorting:");
		display(ducks);
		
		

		System.out.println("\nSorting from Letters...");
		Arrays.sort(ducks2, DuckString.DuckStringComparator);
		// Arrays.sort(fruits, Fruit.FruitNameComparator); // --> by name
		//Arrays.sort(ducks2);
		display(ducks2);
		}
	
	
	
	
	public static void display(Duck[] ducks) {
		for (Duck d : ducks) {
			System.out.println(d);
		}
	}
	
}
