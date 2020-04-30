package de.Flugzeug;

public class Segelflugzeug extends Flugzeug{
	
	private static int anzahlSegelflugzeuge;

	public Segelflugzeug(double spannweite) {
		super(spannweite, 1);
		setAnzahlSegelflugzeuge(getAnzahlSegelflugzeuge() + 1);
	
	}

	
	public String toString() {
		return "Spannweite: " + this.getSpannweite() + ", Sitze: " + this.getSitzplaetze() + " (Segelflugzeug)";
		
	}


	public static int getAnzahlSegelflugzeuge() {
		return anzahlSegelflugzeuge;
	}


	public static void setAnzahlSegelflugzeuge(int anzahlSegelflugzeuge) {
		Segelflugzeug.anzahlSegelflugzeuge = anzahlSegelflugzeuge;
	}
	
	
	
	
}


