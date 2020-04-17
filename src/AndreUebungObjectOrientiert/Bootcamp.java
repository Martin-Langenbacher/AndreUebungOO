package AndreUebungObjectOrientiert;

import java.util.Arrays;

/*
 ---> Instanz = Objekt
 ---> Variable = Attribut
 ---> Aufgabe des Konstruktors:
      - Für sauberen Startzustand des Objekts sorgen
 	  - Wird einmalig bei Objekterzeugung aufgerufen
 	  - Schreibt in jede Instanzvariable einen Startwert rein
 
 @von Autor AClass

*/

public class Bootcamp {
	
	/* Klassenvariablen */
	// mit static gehört er nun zur Klasse
	static int anzahl = 0;
	
	
	/* Instanzvariablen */
	
	private String[] members;
	private String trainer;
	private int week;
	private boolean remote;
	// mit private benötigen wir nun getters & setters
	
	
	/* Konstruktor */
	
	public Bootcamp() {
		this(new String[0], "Andre");
	}
	
	
	public Bootcamp(String trainer) {
		this(new String[0], trainer);
	}
	
	
	public Bootcamp(String[] members, String trainer) {
		this(members, trainer, 1, false);
	}
	
	/* dont repeat yourself, that is why the below code is not needed anymore...
	 * =============================================================================================================
	public Bootcamp(String[] members, String trainer) {
		// nur "members = {"Martin", "Alexander", "Frank", "Monika", "Bert"};" geht es nicht...
		// so:
		//String[] members = {"Martin", "Alexander", "Frank", "Monika", "Bert"};
		// oder so:
		//members = new String[] {"Martin", "Alexander", "Frank", "Monika", "Bert"};
		this.members = members;
		this.trainer = trainer;
		// this: Ich spreche das Objekt selbst an, innerhalb der Klasse (sonst: local vor global)
		week = 1;
		remote = false;
				
	} */
	
	
	
	public Bootcamp(String[] members, String trainer, int week, boolean remote) {
		this.members = members.clone();
		this.trainer = trainer.toUpperCase(); // don't repeat; only on one place...
		this.week = week;
		this.remote = remote;
		anzahl++;
		// oder Bootcamp.anzahl++;
	}
	
	

	/* Instanzmethoden */
	
	public String[] getMembers() {
		return members;
	}
	
	
	
	public void setMembers(String[] members) {
		this.members = members.clone(); // auch hier clone (Sicherheit): ==> Immer wenn ich von außen etwas bekommen, was ein Referenz-Tpy ist, 
										// gerade bei Feldern, sollte ich darüber nachdenken, ob ich noch einmal clone, damit das Feld nicht nachträglich
										// manipuliert werden kann.
		
										// Problem bei übergabe von GANZEM F E L D !!!
	}
	
	
//==============================================================================================================>>>
	// nachträglich einen member dazufügen: Arrays können nicht erweitert werden...
	public void setMembers(String member) {
		// 1) neues Feld mit Länge um eins länger
		String[] members = new String[this.members.length +1];
		
		// 2) bisherige Werte rüberschieben
		for (int i = 0; i < this.members.length; i++) {
			members[i] = this.members[i];
		}
		
		// 3) in das hinterste freie Feld den neuen Wert reinschreiben
		members[members.length -1] = member;
		
		// 4) Referenz umlegen
		this.members = members;
	}
	// bei Array-List hat sich das aber erledigt...
//==============================================================================================================>>>


	public String getTrainer() {
		return trainer;
	}


	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}


	public int getWeek() {
		return week;
	}


	public void setWeek(int week) {
		this.week = week;
	}


	public boolean isRemote() {
		return remote;
	}


	public void setRemote(boolean remote) {
		this.remote = remote;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return "Bootcamp juhu";
		
		// --> mit super meinen wir immer die Oberklasse (d.h. dies gibt noch einmal die überschriebene Methode aus...)
		//     ... man kann das wieder verwenden was wir überschreiben...
		// return super.toString() + ": ab hier ist es erweitern... ;-)";
		//return java.util.Arrays.toString(this.members) + " || " + this.trainer;
		return Arrays.toString(this.members) + " || " + this.trainer;
	}
	
	
	public void foo() {
		System.out.println("bar");
	}
	
	
	
	/* Klassenmethoden */
	// Klassenmethoden heißt, es ist auch ein ausführbares Programm
	
	public static void main(String[] args) {
		// alles was static ist gehört zur Klasse (static steuert nur, was zur Klasse bzw. zum Objekt gehört...!)
		// was kein static hat gehört zum Objekt (dann hat das Objekt z.B. eine getTrainer-Methode...
		
		Bootcamp b = new Bootcamp();
		// Bootcamp.foo(); --> Klassen-Methode mit static bei foo
		b.foo(); // --> jetzt kann ich es vom Objekt aufrufen !
		
	}
	
	/*
	public static void main(String[] args) {
		System.out.println(Bootcamp.anzahl); // ohne Bootcamp schaut er nach: Gibt es eine Instanzvariable mit dem Namen anzahl? Sonst nimmt er die Klassenvarible...
		Bootcamp b1 = new Bootcamp();
		System.out.println(anzahl);
		Bootcamp b2 = new Bootcamp();
		System.out.println(anzahl);
	}
	*/
	
	
	
	

	

}
