package de.kopfBisFuss.chapter11;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EinfacheGui1 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JButton button = new JButton("klick mich");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // diese Zeile sorgt dafür, dass beim Schließen des Fensters auch das Programm geschlosssen wird
		
		frame.getContentPane().add(button); 					// fügt den Button zur ContentPane - der "Fensterscheibe" im Frame - hinzu
		
		frame.setSize(330, 300);
		
		frame.setVisible(true);

	}

}
