package de.markus.session2;

public class LukeAndDarth {

	public static void main(String[] args) {
		
		Luke luke = new Luke();
		Darth darth = new Darth();
		System.out.println( luke.getDad() );   // null
		
		darth.revealTruthTo(luke);
		
		System.out.println( luke.getDad() );   // Darth@6ff3c5b5
	}

}


// Erklärung:
/*
 
  Möchte sich ein Objekt A einem anderen Objekt B mitteilen, damit B das andere Objekt A 'kennt', so funktioniert das gut mit der this-Referenz:
  
  Ich bin der Vater-Beispiel (Java ist auch eine Insel): Zwei Klassen Luke und Darth repräsentieren zwei Personen, wobei Luke ein Attribut dad 
  für seinen Vater hat: 
  
  --> Darth dad; (bei class Luke)
  
  Spannend ist die Methode revealTruthTo(Luke), denn sie setzt beim übergebenen Luke-Objekt das dad-Attribut mit der this-Referenz.
  --> Damit kennt Luke seinen Vater, getestet in dieser Klasse (LukeAndDarth).
  
  
  
  ML: Noch nicht ganz klar: Attribute dad... ??????

*/