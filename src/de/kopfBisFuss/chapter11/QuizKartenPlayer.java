package de.kopfBisFuss.chapter11;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class QuizKartenPlayer {
	
	private JTextArea anzeige;
	private ArrayList<QuizKarte> kartenListe;
	private QuizKarte aktuelleKarte;
	private int aktuelleKarteIndex;
	private JFrame frame;
	private JButton nächsteKarteButton;
	private boolean istAntwortAngezeigt;

	public static void main(String[] args) {
		QuizKartenPlayer reader = new QuizKartenPlayer();
		reader.los();
	}

	
	private void los() {
		
		// GUI aufbauen
		frame = new JFrame ("Quizkarten-Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel hauptPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);
		
		anzeige = new JTextArea(10, 20);
		anzeige.setFont(bigFont);
		
		anzeige.setLineWrap(true);
		anzeige.setEditable(false);
		
		JScrollPane fScroller = new JScrollPane(anzeige);
		fScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		fScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		nächsteKarteButton = new JButton("Frage zeigen");
		hauptPanel.add(fScroller);
		hauptPanel.add(nächsteKarteButton);
		nächsteKarteButton.addActionListener(new NächsteKarteListener());
		
		JMenuBar menüleiste = new JMenuBar();
		JMenu menüDatei = new JMenu("Datei");
		JMenuItem menüPunktLaden = new JMenuItem("Kartensatz laden");
		menüPunktLaden.addActionListener(new MenüÖffnenListener());
		menüDatei.add(menüPunktLaden);
		menüleiste.add(menüDatei);
		frame.setJMenuBar(menüleiste);
		frame.getContentPane().add(BorderLayout.CENTER, hauptPanel);
		frame.setSize(500,600);
		frame.setVisible(true);
	} // los() schließen

	
	public class NächsteKarteListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			if (istAntwortAngezeigt) {
				// die Antwort anzeigen, weil die Frage schon gezeigt wurde
				anzeige.setText(aktuelleKarte.getAntwort());
				nächsteKarteButton.setText("Nächste Karte");
				istAntwortAngezeigt = false;
			} else {
				// nächste Frage zeigen
				if (aktuelleKarteIndex < kartenListe.size()) {
					nächsteKarteZeigen();
				} else {
					// es gibt keine Karten mehr
					anzeige.setText("Das war die letzte Karte.");
					nächsteKarteButton.setEnabled(false);
				}
			}
		}
	}
	
	public class MenüÖffnenListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			JFileChooser dateiÖffnen = new JFileChooser();
			dateiÖffnen.showOpenDialog(frame);
			dateiLaden(dateiÖffnen.getSelectedFile());	
		}
	}
	
	
	private void dateiLaden(File datei) {
		
		kartenListe = new ArrayList<QuizKarte>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(datei));
			String zeile = null;
			while ((zeile = reader.readLine()) != null) {
				karteErstellen(zeile);
			}
			reader.close();
			
		} catch (Exception ex) {
			System.out.println("konnte Kartendatei nicht lesen");
			ex.printStackTrace();
		}
		
		// fangen wir an und zeigen die erste Karte:
		nächsteKarteZeigen();
	}
	
	private void karteErstellen(String zuParsendeZeile) {
		String[] ergebnis = zuParsendeZeile.split("/");
		QuizKarte karte = new QuizKarte(ergebnis[0], ergebnis[1]);
		kartenListe.add(karte);
		System.out.println("Karte erstellt");
		}
	
	private void nächsteKarteZeigen() {
		aktuelleKarte = kartenListe.get(aktuelleKarteIndex);
		aktuelleKarteIndex++;
		anzeige.setText(aktuelleKarte.getFrage());
		nächsteKarteButton.setText("Antwort zeigen");
		istAntwortAngezeigt = true;
	}
} // Klasse schließen


