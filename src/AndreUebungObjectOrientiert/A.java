package AndreUebungObjectOrientiert;

public class A {

	public static void main(String[] args) {
		
		C.foo2(); // die Methode in C.class muss static sein
		B b = new B();
		b.foo(); // hier ist die Methode eine Methode des Objekts (siehe B.class)
		

	
	
//==================================================================================================================================<<<<<<<<<	
		//Aufruf von einer Methode in einer anderen Klasse:
		// 1) von einer Klasse
		// Name der Klasse und dann Methode!
		C.foo2();
	
	
		// 2) von einem Objekt
		// a) Objekt von Klasse Bootcamp und dann kann man die Methode aufrufen.
		b.foo();
		
		
	}
		
}

