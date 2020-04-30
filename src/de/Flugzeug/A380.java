package de.Flugzeug;

public class A380 extends Passagierflugzeug{
	
	private static int anzahl380;

	public A380() {
		super("A380", 79.8, 558, 1280.0);
		setAnzahl380(getAnzahl380() + 1);
	}
	
	public static int getAnzahlA380() {
		return getAnzahlA380();
	}

	public static int getAnzahl380() {
		return anzahl380;
	}

	
	public static void setAnzahl380(int anzahl380) {
		A380.anzahl380 = anzahl380;
	};
	
	
	

}
