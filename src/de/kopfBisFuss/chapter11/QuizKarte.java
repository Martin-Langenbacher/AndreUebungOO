package de.kopfBisFuss.chapter11;

public class QuizKarte {
	
	String frage;
	String antwort;
	
	
	
	public QuizKarte(String frage, String antwort) {
		this.frage = frage;
		this.antwort = antwort;
	}


	public String getFrage() {
		return frage;
	}


	public void setFrage(String frage) {
		this.frage = frage;
	}


	public String getAntwort() {
		return antwort;
	}


	public void setAntwort(String antwort) {
		this.antwort = antwort;
	}

}


