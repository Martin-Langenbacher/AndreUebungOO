package de.markus.session2;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		
		// vor Generics
		List list = new ArrayList();
		list.add("Apfel");
		list.add("Birne");
		Object object = list.get(0);
		String apfel2 = (String) list.get(0);
		// das ist ein String, glaube mir, darum Casting...
		
		// seit Generics
		List<String> list2 = new ArrayList();
		list2.add("Apfel");
		list2.add("Birne");
		String apfel = list2.get(0);
		

	}

}
