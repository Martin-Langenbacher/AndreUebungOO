package de.Flugzeug;

public class FlugzeugTest {

	public static void main(String[] args) {
		
		// ein Segelflugzeug mit 17m Spannweite erzeugen
		Segelflugzeug sf = new Segelflugzeug(17.0);
		System.out.println(sf);
		
		
		// ein Passagierflugzeug mit 10,97 Spannweite,
		// 4 Plaetzen und 1,3 kN Schub (Cessna 172 P)
		Passagierflugzeug pg = new Passagierflugzeug("Cessna 172 P", 10.97, 4, 1.3);
		System.out.println(pg);
		
		
		// eine A380 erzeugen (Jede A380 sieht gleich aus.)
		A380 a380 = new A380();
		System.out.println(a380);
		
		A380 a3802 = new A380();
		System.out.println(a380);
		
		A380 a3803 = new A380();
		System.out.println(a380);
		
		
		// XXX hier die Anzahl jeder Kategorien:
		System.out.println();
		System.out.println("Anzahl der Flugzeuge: " +Flugzeug.getAnzahlFlugzeuge());
		System.out.println("Anzahl der Segelflugzeuge: " +Segelflugzeug.getAnzahlSegelflugzeuge());
		System.out.println("Anzahl der Passagierflugzeuge: " +Passagierflugzeug.getAnzahlPassagierflugzeuge());
		System.out.println("Anzahl A380: " +A380.getAnzahl380());
	}

}

