package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class TrimSort2Inner {
	
	/** Innere Klasse (auf Methodenniveau) */
	class TrimmingComparator implements Comparator<String> {
		
		@Override
		public int compare(String s1, String s2) {
			
			return s1.trim().compareTo(s2.trim());
		}

	}
	
	
	
	public static void main(String[] args) {
		
		String[] words = { "M", "\nSkyfall", " Q", "\t\tAdele\t", "Ma" };
		
		Arrays.sort(words, new TrimSort2Inner().new TrimmingComparator()); /** externe Klasse */
			
			System.out.println(Arrays.toString(words));

		}

	

}


// um an die innere Klasse heranzukommen müssen wir das Objekt erzeugen: "new TrimSort2Inner().new TrimmingComparator() 
// --> es braucht immer ein Objekt um an die innere Klasser heranzukommen!
