package de.markus.session1;

public class QuestionCode {
	
	
	// Ich verstehe den Code nicht:
	mHelper = new IabHelper(this, base64EncodedPublicKey);
	
	
	// Aufruf mit mHelper:
	mHelper.startSetup(new IabHelper.OnIabSetupFinishedListener() {
			// Sobald die Initialisierung beendet ist, wird die Hilfsklasse die Methode onIabSetup-Finished() in dem anonymen Listener aufrufen.
		public void onIabSetupFinished(IabResult result) {   
			// ...
			mHelper.queryInventoryAsync(mGotInventoryListener);
			
		}
	});
	
		
	
	
	
	
	// Was ist das?
	IabHelper.QueryInventoryFinishedListener() {
		public void onQueryInventoryFinished(IabResult result, Inventory inventory) {
			
		}
	}
	
	
}
	


