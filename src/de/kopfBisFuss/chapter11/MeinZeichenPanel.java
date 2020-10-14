package de.kopfBisFuss.chapter11;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MeinZeichenPanel extends JPanel {
	public void paintComponent(Graphics g) {
		// Vode zum Ausfüllen des Ovals mit einer Zufallsfarbe
		Graphics2D g2d = (Graphics2D) g;
		
		int rot = (int) (Math.random() * 255);
		int grün = (int) (Math.random() * 255);
		int blau = (int) (Math.random() * 255);
		Color startColor = new Color(rot, grün, blau);
		
		rot = (int) (Math.random() * 255);
		grün = (int) (Math.random() * 255);
		blau = (int) (Math.random() * 255);
		Color endColor = new Color(rot, grün, blau);
		
		
		GradientPaint gradien = new GradientPaint(70,70,startColor, 150, 150, endColor);
		g2d.setPaint(gradien);
		g2d.fillOval(30, 80, 100, 100);
	}
}
