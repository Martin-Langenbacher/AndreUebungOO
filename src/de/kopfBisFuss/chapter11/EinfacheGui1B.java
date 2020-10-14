package de.kopfBisFuss.chapter11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EinfacheGui1B implements ActionListener{
	
	JButton button;

	public static void main(String[] args) {
		EinfacheGui1B gui = new EinfacheGui1B();
		gui.los();
	}
		
	
	public void los() {
		 JFrame frame = new JFrame();
		 button = new JButton("klick mich");
		 
		 // registrieren Sie den Button beim Listener...
		 button.addActionListener(this);
		 
		 frame.getContentPane().add(button);						// fügt den Button zur ContentPane - der "Fensterscheibe" im Frame - hinzu
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// diese Zeile sorgt dafür, dass beim Schließen des Fensters auch das Programm geschlosssen wird
		 frame.setSize(330, 300);
		 frame.setVisible(true);
	}


	public void actionPerformed(ActionEvent event) {
		button.setText("Ich wurde gecklickt!");
	}

}
