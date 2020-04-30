package de.Flugzeug;

public class Flugzeug {
	
	private double spannweite;
	private int sitzplaetze;
	private static int anzahlFlugzeuge;
	
	
	public Flugzeug(double spannweite, int sitzplaetze) {
		this.spannweite = spannweite;
		this.sitzplaetze = sitzplaetze;
		setAnzahlFlugzeuge(getAnzahlFlugzeuge() + 1);
	}


	public double getSpannweite() {
		return spannweite;
	}


	public int getSitzplaetze() {
		return sitzplaetze;
	}
	
	
	
	
	public String toString() {
		return "Spannweite: " + this.getSpannweite() + ", Sitze: " + this.getSitzplaetze() + ", Schub: "; // +this.getSchub Sitzplätze";	
	}

	
	

	public static int getAnzahlFlugzeuge() {
		return anzahlFlugzeuge;
	}


	public static void setAnzahlFlugzeuge(int anzahlFlugzeuge) {
		Flugzeug.anzahlFlugzeuge = anzahlFlugzeuge;
	}
	
	
}
