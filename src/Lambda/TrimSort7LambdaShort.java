package Lambda;

import java.util.Arrays;

public class TrimSort7LambdaShort {

	public static void main(String[] args) {
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t", "Ma", "ZZZ", "Ko", "Du", "Y", "Bmx" };
		
		/** Lamda-Ausdruck (minimale Schreibweise) */
		Arrays.sort(words, (s1, s2) -> s1.trim().compareTo(s2.trim()) );
		
		System.out.println(Arrays.toString(words));
		
	}

}
// wenn man nur eine Anweisung "drin hat" kann man die unteren Dinge weglassen und man sieht die Lösung oben...!





/*  Version 5:

public class TrimSort5Lamda {

	public static void main(String[] args) {
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t", "Ma", "Ko" };
		
		Arrays.sort(words, (String s1, String s2) -> {
			return s1.trim().compareTo(s2.trim());
		});
		System.out.println(Arrays.toString(words));
		
	}

}
 
 
Version 6: 

public class TrimSort6LambdaVar {

	public static void main(String[] args) {
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t", "Ma", "Ko", "Du" };
		
		Comparator<String> c = (s1, s2) -> s1.trim().compareTo(s2.trim());
		
		Arrays.sort(words, c);
		
		System.out.println(Arrays.toString(words));
	}
}


*/