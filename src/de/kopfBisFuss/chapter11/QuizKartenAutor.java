package de.kopfBisFuss.chapter11;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class QuizKartenAutor {
	
	private JTextArea frage;
	private JTextArea antwort;
	private ArrayList<QuizKarte> kartenListe;
	private JFrame frame;
	

	public static void main(String[] args) {
		QuizKartenAutor editor = new QuizKartenAutor();
		editor.los();
	}


	private void los() {
		// GUI erstellen
		
		frame = new JFrame("Quizkarten-Autor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font ("sanserif", Font.BOLD, 24);
		frage = new JTextArea(6, 20);
		frage.setLineWrap(true);
		frage.setWrapStyleWord(true);
		frage.setFont(bigFont);
		
		JScrollPane fScroller = new JScrollPane(frage);
		fScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		fScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		antwort = new JTextArea(6,20);
		antwort.setLineWrap(true);
		antwort.setWrapStyleWord(true);
		antwort.setFont(bigFont);
		
		JScrollPane aScroller = new JScrollPane(antwort);
		aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nächsteKarteButtton = new JButton("Nächste Karte");
		
		kartenListe = new ArrayList<QuizKarte>();
		
		JLabel fLabel = new JLabel("Die Frage lautet:");
		JLabel aLabel = new JLabel("Die Antwort lautet:");
		
		mainPanel.add(fLabel);
		mainPanel.add(fScroller);
		mainPanel.add(aLabel);
		mainPanel.add(aScroller);
		mainPanel.add(nächsteKarteButtton);
		nächsteKarteButtton.addActionListener(new NächsteKarteListener());
		JMenuBar menüleiste = new JMenuBar();
		JMenu menüDatei = new JMenu("Datei");
		JMenuItem menüPunktNeu = new JMenuItem("Neu");
		
		JMenuItem menüPunktSpeichern = new JMenuItem("Speichern");
		menüPunktNeu.addActionListener(new MenüNeuListener());
		
		menüPunktSpeichern.addActionListener(new MenüSpeichernListener());
		menüDatei.add(menüPunktNeu);
		menüDatei.add(menüPunktSpeichern);
		menüleiste.add(menüDatei);		
		
		frame.setJMenuBar(menüleiste);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(500, 600);
		frame.setVisible(true);
	}
	
	
	public class NächsteKarteListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			
			QuizKarte karte = new QuizKarte(frage.getText(), antwort.getText());
			kartenListe.add(karte);
			karteAbräumen();
		}
	}
	
	
	public class MenüSpeichernListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			QuizKarte karte = new QuizKarte(frage.getText(), antwort.getText());
			kartenListe.add(karte);
			
			JFileChooser dateiWahl = new JFileChooser();	
			dateiWahl.showSaveDialog(frame);
			dateiSpeichern(dateiWahl.getSelectedFile());
		}
	}
	
	
	public class MenüNeuListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			kartenListe.clear();
			karteAbräumen();
		}
	}
	
	private void karteAbräumen() {
		frage.setText("");
		antwort.setText("");
		frage.requestFocus();
	}
	
	
	private void dateiSpeichern(File datei) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter (datei));
			
			for (QuizKarte karte:kartenListe) {
				writer.write(karte.getFrage() + "/");
				writer.write(karte.getAntwort() + "\n");
			}
			writer.close();
			
		} catch (Exception ex) {
			System.out.println("konnte die Kartenliste nicht schreiben");
			ex.printStackTrace();
		}		
	}
} 
