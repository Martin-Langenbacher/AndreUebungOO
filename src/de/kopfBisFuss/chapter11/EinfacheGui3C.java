package de.kopfBisFuss.chapter11;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EinfacheGui3C implements ActionListener {
	
	JFrame frame;

	public static void main(String[] args) {
		EinfacheGui3C gui = new EinfacheGui3C();
		gui.los();
	}

	private void los() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Farbe wechseln");
		button.addActionListener(this);
		
		MeinZeichenPanel zeichenPanel = new MeinZeichenPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, zeichenPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.repaint();
	}

}
