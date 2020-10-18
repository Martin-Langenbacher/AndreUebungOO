package de.kopfBisFuss.chapter11;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class QuizKartenPlayer {
	
	private JTextArea anzeige;
	private ArrayList<QuizKarte> kartenListe;
	private QuizKarte aktuelleKarte;
	private int aktuelleKarteIndex;
	private JFrame frame;
	private JButton nächsteKarteButton;
	private boolean istAntwortAngezegt;

	public static void main(String[] args) {
		QuizKartenPlayer reader = new QuizKartenPlayer();
		reader.los();
	}

	
	private void los() {
		
		// GUI aufbauen
		
	}

}
