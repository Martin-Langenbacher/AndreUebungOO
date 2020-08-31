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
		
		
		
		// innere Klasse
		class MyClass {
			int x = 5;	
		}
		
		// geht dies nur NACH der inneren Klasse "MyClass" ???
		MyClass myObj = new MyClass();
		System.out.println("\n" + myObj.x + "<== just another example with myObj AND an inner Class ... (has nothing to do with the lines before!");
			  
		
	}

}
