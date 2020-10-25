package de.kopfBisFuss.chapter11;

public class Song implements Comparable<Song> {
	String titel;
	String künstler;
	String bewertung;
	String bpm;
	
	
	// Konstruktor:
	public Song(String t, String k, String bw, String b) {
		this.titel = t;
		this.künstler = k;
		this.bewertung = bw;
		this.bpm = b;
	}

	// Getters:
	public String getTitel() {
		return titel;
	}

	public String getKünstler() {
		return künstler;
	}

	public String getBewertung() {
		return bewertung;
	}

	public String getBpm() {
		return bpm;
	}
	
	
	// toString:
	public String toString() {
		return titel;
	}
	
	
	
	@Override
	public int compareTo(Song s) {
		return this.titel.compareTo(s.getTitel());
	}

	
}
