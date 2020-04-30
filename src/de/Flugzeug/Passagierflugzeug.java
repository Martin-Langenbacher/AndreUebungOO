package de.Flugzeug;

public class Passagierflugzeug extends Flugzeug{
	
	private static int anzahlPassagierflugzeuge;
	private double schub;
	private String flugzeugtyp;	
	
	public Passagierflugzeug(String flugzeugtyp, double spannweite, int sitzplaetze, double schub) {
		super(spannweite, sitzplaetze);
		this.schub = schub;
		this.flugzeugtyp = flugzeugtyp; 
		setAnzahlPassagierflugzeuge(getAnzahlPassagierflugzeuge() + 1);
		
	}

	public String toString() {
		return "Spannweite: " + this.getSpannweite() + ", Sitze: " + this.getSitzplaetze() + ", Schub: " + this.getSchub() +" kN (Passagierflugzeug)  --->  " +this.getFlugzeugtyp();		
	}

	public static int getAnzahlPassagierflugzeuge() {
		return anzahlPassagierflugzeuge;
	}

	public static void setAnzahlPassagierflugzeuge(int anzahlPassagierflugzeuge) {
		Passagierflugzeug.anzahlPassagierflugzeuge = anzahlPassagierflugzeuge;
	}

	public double getSchub() {
		return schub;
	}

	public String getFlugzeugtyp() {
		return flugzeugtyp;
	}

	

}


