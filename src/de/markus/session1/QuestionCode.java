package de.markus.session1;

public class QuestionCode {
	
	public static void main(String[] args) {
		
		// Some remarks after the session with Markus:
		
		/*
		  
		1) QueryInventoryFinishedListener is static
		
		2) Konstruktor-Aufruf:      --> KonstruktorClass konst = new KonstruktorClass();
		
		3) Anonyme Klasse erkennen: --> new TypeName () {...}
		
			// new TypeName () { ... }
			//  ^     ^            ^
			//  a     b            c
			 
			// a: new must be present
			// b: usually the name of an Interface
			// c: has an implementation block
			
			// advantage: briefest way
			// disadvantage: can not be re-used
			// disadvantage: has no describing name--> new 
		
		4) Inneres Anonymes Interface:
		
			IabHelper.QueryInventoryFinishedListener mGotInventoryListener = new IabHelper.QueryInventoryFinishedListener() {
			
				==> Methode des Interfaces muss hier rein...!  --> Eclipse kann helfen !
			 
			 	// Hier kommt dann der Aufruf der Methode:
			 	   onQueryInventoryFinished...();
		}
		
		
		
		5) innere anonyme Klasse:
		==================================
		
				// Aufruf mit mHelper:
				   		mHelper.startSetup(new IabHelper.OnIabSetupFinishedListener() {
				   				// Sobald die Initialisierung beendet ist, wird die Hilfsklasse die Methode onIabSetup-Finished() in dem anonymen Listener aufrufen.
				   			public void onIabSetupFinished(IabResult result) {   
				   				// ...
				   				 	mHelper.queryInventoryAsync(mGotInventoryListener);
				   			}
				   		});
		
		
		
		
		
		
		*/
		
		System.out.println("Infos only !!!");
	
	}
	
}
	


