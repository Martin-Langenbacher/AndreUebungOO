package de.markus.session3;

public class A {
	
	interface B {
		
		void b();
		default void c() {
			System.out.println("Hier bin ich in Methode c");
			b();
		}
	}
	
	// ich benötige static weil der Konstruktor-Aufruf außerhalb der Klasse ist.
	// Ohne static könnte ich dies in A schreiben: Aber nur in Instanz-Methoden.
	abstract static class D {
		
		abstract void b();
		void c() {
			System.out.println("Hier bin ich in Methode c, in class D");
			b();
		}
	} 
	
	

}
