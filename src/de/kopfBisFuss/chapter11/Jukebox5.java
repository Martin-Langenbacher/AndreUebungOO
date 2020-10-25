package de.kopfBisFuss.chapter11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox5 {
	
	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new Jukebox5().los();
	}
	
	
	// neue innere Klasse, die Comparator implementiert: Wir vergleichen Song-Objekt!
	class KünstlerVergleich implements Comparator<Song> {
		public int compare(Song eins, Song zwei) {
			return eins.getKünstler().compareTo(zwei.getKünstler());
		}
	}

	// Bewertungs-Vergleich...
		class BewertungVergleich implements Comparator<Song> {
			public int compare(Song eins, Song zwei) {
				return eins.getBewertung().compareTo(zwei.getBewertung());
			}
		}
		
	
	private void los() {
		getSongs();
		System.out.print("Ohne Sortierung:       ");
		System.out.println(songList);
		Collections.sort(songList);
		System.out.print("SongTitle-Sortierung:  ");
		System.out.println(songList);
		
		KünstlerVergleich künstlerVergleich = new KünstlerVergleich();
		Collections.sort(songList, künstlerVergleich);
		
		System.out.print("Künstler-Sortierung:   ");
		System.out.println(songList);
		
		BewertungVergleich bewertungVergleich = new BewertungVergleich();
		Collections.sort(songList, bewertungVergleich);
		
		System.out.print("Bewertung-Sortierung:  ");
		System.out.println(songList);
		
		
	}


	void getSongs() {
		try {
			File datei = new File("SongListPlus.txt");
			BufferedReader reader = new BufferedReader(new FileReader(datei));
			String zeile = null;
			while ((zeile= reader.readLine()) != null) {
				addSong(zeile);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	void addSong(String zuParsendeZeile) {
		String[] tokens = zuParsendeZeile.split("/");
		
		Song nächsterSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nächsterSong);
	}

}
