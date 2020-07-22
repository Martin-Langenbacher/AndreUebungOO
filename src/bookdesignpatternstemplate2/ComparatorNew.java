package bookdesignpatternstemplate2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorNew {
	
public static void main(String[] args) {
		
		// 1. Sort an Array
		
		/*
		String[] fruits = new String[] {"Pinapple", "Apple", "Orange", "Banana",
	public static Comparator<DuckString> DuckStringComparator = new Comparator<DuckString>() {

		public int compare(DuckString duck1, DuckString duck2) {
			
			String duckName1 = duck1.getName();
			String duckName2 = duck2.getName();
			return duckName1.compareTo(duckName2);
		}
		
	};

	
	
	 "Mango" };
		
		Arrays.parallelSort(fruits);
		
		int i = 0;
		for (String temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp);
		}
		*/
		
//***********************************************************************************************************
		// 2. Sort an ArrayList
		
		/*
		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Pineapple");
		fruits.add("Tomato");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Mango");
		
		Collections.sort(fruits);
		
		int i = 0;
		for (String temp : fruits) {
			System.out.println("fruits " + ++i + " : " +temp);
		}
		*/
		
		
//***********************************************************************************************************
		// 3. Sort an Object with Comparable
		
		// --> allows only to sort a single property (but see number 4. below !!!!!

/*
public class SortFruitObject{
	public string void main(String args[]) {
	--> geht so nicht, da es in einer eigenen Datei sein muss !!!!
*/
		
		Fruit[] fruits = new Fruit[5];
		
		Fruit pineapple = new Fruit("Pineapple", "Pineapple description", 70);
		Fruit apple = new Fruit("Apple", "Apple description", 100);
		Fruit orange = new Fruit("Orange", "Orange description", 80);
		Fruit banana = new Fruit("Banana", "Banana description", 90);
		Fruit mango = new Fruit("Mango", "Mango description", 150);
		
		fruits[0] = pineapple;
		fruits[1] = apple;
		fruits[2] = orange;
		fruits[3] = banana;
		fruits[4] = mango;
		
		//this is for example 3:
		// Arrays.sort(fruits);
		
		//4. --> Sort an Object with Comparator
		//Arrays.sort(fruits); // --> quantity
		Arrays.sort(fruits, Fruit.FruitNameComparator); // --> by name
		
		
		int i = 0;
		for (Fruit temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
			 ", Quantity : " + temp.getQuantity());
			
		}
		
//***********************************************************************************************************
		// 4. Sort an Object with Comparator
		//    --> ist hier genau wie bei 3. !
		
		
	}

}
