package de.kopfBisFuss.chapter11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SpielSpeicherungTest {

	public static void main(String[] args) {
		Spielfigur eins = new Spielfigur(50, "Elb", new String[] { "Bogen", "Schwert", "Staub" });
		Spielfigur zwei = new Spielfigur(200, "Troll", new String[] { "bloße Hände", "große Axt" });
		Spielfigur drei = new Spielfigur(120, "Zauberer", new String[] { "Zaubersprüche", "Unsichtbarkeit" });
		
		// der Code, der hier steht, soll mit den Figuren etwas machen, was ihre Zustandswerte ändern könnte
		
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Spiel.ser"));
			os.writeObject(eins);
			os.writeObject(zwei);
			os.writeObject(drei);
			os.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		//eins = null;
		zwei = null;
		drei = null;
		
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Spiel.ser"));
			Spielfigur einsWiederhergestellt = (Spielfigur) is.readObject();
			Spielfigur zweiWiederhergestellt = (Spielfigur) is.readObject();
			Spielfigur dreiWiederhergestellt = (Spielfigur) is.readObject();
			is.close();
			
			System.out.println("Typ 1. Figur: " +einsWiederhergestellt.getTyp());
			System.out.println("Typ 2. Figur: " +zweiWiederhergestellt.getTyp());
			System.out.println("Typ 3. Figur: " +dreiWiederhergestellt.getTyp());
			System.out.println("Typ 3. Figur (Waffen): " +dreiWiederhergestellt.getWaffen());
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

}
