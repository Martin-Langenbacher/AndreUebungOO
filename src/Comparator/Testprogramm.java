package Comparator;

import java.util.ArrayList;
import java.util.Arrays;

public class Testprogramm {
	
	public static void main(String[] args) {
		
		
		Apfel o1 = new Apfel("Roter Apfel", 3);
		Apfel o2 = new Apfel("Grüner Apfel", 5);
		Birne o3 = new Birne("Blaue Birne", 4);
		Birne o4 = new Birne("Gelbe Birne", 2);
		
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);
		
		int apfelCompareResult = o1.compareTo(o2);
		int birneCompareResult = o3.compareTo(o4);
		
		System.out.println();
		System.out.println(apfelCompareResult);
		System.out.println(birneCompareResult);
		System.out.println();
		
		if (apfelCompareResult < 0)
			System.out.println(o1 + " < " + o2);
		else if (apfelCompareResult > 0)
			System.out.println(o1 + " > " + o2);
		else
			System.out.println(o1 + " = " + o2);
		
		if (birneCompareResult < 0)
			System.out.println(o3 + " < " + o4);
		else if (birneCompareResult > 0)
			System.out.println(o3 + " > " + o4);
		else
			System.out.println(o3 + " = " + o4);
		
		System.out.println();
		
		NamensComparator nc = new NamensComparator();
		AltersComparator ac = new AltersComparator();
		
		// Änderung in NamensComparator von Birne nach Obst - oder cast...
		System.out.println(nc.compare((Birne)o3, (Birne)o4));
		// Cast auf Birne, da ich Birne übergeben muss!
		System.out.println(ac.compare((Birne)o3, (Birne)o4));
		
		System.out.println();
		
		// Äpfel mit Birnen verglichen!
		ObstComparator oc = new ObstComparator();
		System.out.println(oc.compare(o2, o4));
		
		System.out.println();
		
		
		// Obst sortieren
		ArrayList<Obst> list = new ArrayList<Obst>();
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		
		Obst[] salat = {o1, o2, o3, o4};
		
		// wenn ein import da ist, kann 'java.util.' auch weggelassen werden"
		System.out.println("Unsortiert:  '" +salat[0].getName() + "'  ist das erste Objekt in der Liste.");
		System.out.println(java.util.Arrays.toString(salat));
		
		Arrays.sort(salat, oc);  // --> oc ist der Obst-Comparator; ich könnte aber auch etwas anderes hier einsetzen... 
		
		System.out.println();
		System.out.println("Sortiert:  '" +salat[0].getName() + "'  ist das erste Objekt in der Liste.");
		System.out.println(Arrays.toString(salat));
		
		
		// Will man die Reihenfolge ändern, z.B. absteigend, dann muss man den ObstComparator folgendermaßen abändern:
		// absteigend: ==> return o2.getName().compareTo(o1.getName());
		
		
		
		
	}
	
}
