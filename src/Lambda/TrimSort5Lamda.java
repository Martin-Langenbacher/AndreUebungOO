package Lambda;

import java.util.Arrays;

public class TrimSort5Lamda {

	public static void main(String[] args) {
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t", "Ma", "Ko" };
		
		/** Lamda-Ausdruck (ausführliche Schreibweise) */
		Arrays.sort(words, (String s1, String s2) -> {
			return s1.trim().compareTo(s2.trim());
		});
		System.out.println(Arrays.toString(words));
		
	}

}
// das geht nur mit einem Interface, das nur eine Methode hat - wie hier (Funktional-Interface)! --> Hier darf nicht mehr dazugepackt werden!








/*

public class TrimSort4Anonym {
	
	public static void main(String[] args) {
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t", "Ma" };
		
		
		Arrays.sort(words, new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				
				return s1.trim().compareTo(s2.trim());
			}
		} );
		System.out.println(Arrays.toString(words));
	}
} */

