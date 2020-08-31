package de.markus.session3;



public class QuestionCode3 {

	public static void main(String[] args) {
		
		A.B myAB = new A.B() {
			
			@Override
			public void b() {
				System.out.println("Hier bin ich in A.B");
			}
		};
		//myAB.b();
		myAB.c();
		
		// annonyme implementierung einer inner Class: Die Klasse hat keinen NAME - im gegensatz zu MyAD!
		new A.D() {
			
			@Override
			void b() {
				System.out.println("Hier bin ich in A.D");
				
			}
		}.c();
		// ab new ... bis .c() geht die anonyme Klasse.
		
		
		
		
		// . ich rufe auf einer Instanz A.D eine Methode auf.
		
		
		/*
		
		
		
		
		// ===============================================================================================
		 
		==>> Können wir so etwas einmal bauen:

		A.B() {
			public void b(C c, D d) {
				System.out.println("Zeige etwas...");
			}
		}
		
		// ===============================================================================================
		// Beispiel-Code:
		IabHelper.QueryInventoryFinishedListener() {
			public void onQueryInventoryFinished(IabResult result, Inventory inventory) {
				
			}
		
		// ===============================================================================================
		
		
		
		
		
		
		
		
		Frage: 
		Warum schreibe ich überhaupt Klasse(n)? Ich könnte ein Programm mit Methoden schreiben. 
		
			--> A Class is like an object constructor, or a "blueprint" for creating objects.
		
		
		Und wenn ich das weiß, dann weiß ich wozu anonyme Klassen gut sind !
		
			--> A anonymous class is used only once at exactly that place.
		
		
		Create an Object
		In Java, an object is created from a class. We have already created the class named MyClass, so now we can use this to create objects.
		To create an object of MyClass, specify the class name, followed by the object name, and use the keyword new:
		
		
		// =======================================================================//
		//Themen:
		  - ( REST Controller ) / REST API
		  - Autowire / Rest-Zugriff / Repository-Zugriff / WebClient / Web-Request --> Service-Klasse
		  - LiveData
		  - Observer Pattern
		  - Rest
		  - Asyncron / delay
		  - Thread handling
		
		
		
		*/
		
		
		// innere Klasse
		class MyClass {
			int x = 5;	
		}
		
		// geht dies nur NACH der inneren Klasse "MyClass" ???
		MyClass myObj = new MyClass();
		System.out.println(myObj.x);
			  
			  
		
		
		
	}

}
