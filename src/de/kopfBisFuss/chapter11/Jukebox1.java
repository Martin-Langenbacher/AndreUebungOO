package de.kopfBisFuss.chapter11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {
	
	ArrayList<String> songList = new ArrayList<String>();

	public static void main(String[] args) {
		new Jukebox1().los();
	}

	
	private void los() {
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
	}


	void getSongs() {
		try {
			File datei = new File("SongList.txt");
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
		songList.add(tokens[0]);
	}
	
	
	
	

}
