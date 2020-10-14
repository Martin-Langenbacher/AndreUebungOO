package de.kopfBisFuss.chapter11;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ZweiButtons {
	
	JFrame frame;
	JLabel label;
	
	public static void main(String[] args) {
		ZweiButtons gui = new ZweiButtons ();
		gui.los();
	}
	
	
	private void los() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("Ändere Label");
		labelButton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Ändere Kreis");
		colorButton.addActionListener(new ColorListener());
		
		label = new JLabel(" Ich bin ein Label");
		MeinZeichenPanel zeichenPanel = new MeinZeichenPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, zeichenPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
	
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText(" Autsch!");
		}
	} // innere Klasse schließen

	
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	} // innere Klasse schließen
	
	
}
