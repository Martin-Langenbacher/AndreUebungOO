package de.kopfBisFuss.chapter11;

public class BankKonto {
	private int kontostand = 100;
	
	public int getKontostand() {
		return kontostand;
	}
	
	
	public void abbuchen(int betrag) {
		kontostand = kontostand - betrag;
	}

}
