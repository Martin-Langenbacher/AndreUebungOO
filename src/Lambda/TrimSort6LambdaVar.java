package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class TrimSort6LambdaVar {

	public static void main(String[] args) {
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t", "Ma", "Ko", "Du" };
		
		/** Lamda-Ausdruck (Speicherung von Code in einer Variablen) */
		Comparator<String> c = (s1, s2) -> s1.trim().compareTo(s2.trim());
		
		Arrays.sort(words, c);
		
		System.out.println(Arrays.toString(words));
	}
}



/*

package Lambda;

import java.util.Arrays;

public class TrimSort5Lamda {

	public static void main(String[] args) {
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t", "Ma", "Ko" };
		
		
		Arrays.sort(words, (String s1, String s2) -> {
			return s1.trim().compareTo(s2.trim());
		});
		System.out.println(Arrays.toString(words));
		
	}

}
// das geht nur mit einem Interface, das nur eine Methode hat - wie hier (Funktional-Interface)! --> Hier darf nicht mehr dazugepackt werden!





*/