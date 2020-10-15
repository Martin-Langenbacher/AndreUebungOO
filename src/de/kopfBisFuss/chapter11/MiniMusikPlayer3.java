package de.kopfBisFuss.chapter11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniMusikPlayer3 {
	
	static JFrame f = new JFrame("Mein erstes Musikvideo");
	static MeinZeichenPanel ml;

	public static void main(String[] args) {
		MiniMusikPlayer3 mini = new MiniMusikPlayer3();
		mini.los();	
	}
	
	

	public void guiErstellen() {
		ml = new MeinZeichenPanel();
		f.setContentPane(ml);
		f.setBounds(30, 30, 300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

	private void los() {
		guiErstellen();
		
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addControllerEventListener(ml, new int[] {127});
			Sequence seq = new Sequence (Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			int r = 0;
			for (int i = 0; i < 60; i+=4) {
				r = (int) ((Math.random() * 50) +1 );
				track.add(eventErzeugen(144, 1, r, 100, i));
				track.add(eventErzeugen(176, 1, 127, 0, i));
				track.add(eventErzeugen(128, 1, r, 100, i + 2));
			}
			
			sequencer.setSequence(seq);
			sequencer.start();
			Thread.sleep(5000);
			sequencer.close();
			sequencer.setTempoInBPM(120);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public MidiEvent eventErzeugen(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
			
		} catch (Exception e) { }
		return event;
	}
	
	
	class MeinZeichenPanel extends JPanel implements ControllerEventListener {
		/** serialVersionUID ? Why?
		 * 
		 */
		private static final long serialVersionUID = 1L;
		boolean msg = false;

		public void controlChange(ShortMessage event) {
			msg = true;
			repaint();
		}
		
		
		public void paintComponent(Graphics g) {
			if (msg) {
				
				Graphics2D g2 = (Graphics2D) g;
				
				int r = (int) (Math.random() * 250);
				int gr = (int) (Math.random() * 250);
				int b = (int) (Math.random() * 250);
				
				g2.setColor(new Color(r, gr, b));
				
				int höhe = (int) ((Math.random() * 120) +10);
				int breite = (int) ((Math.random() * 120) +10);
				
				int x = (int) ((Math.random() * 40) +15);
				int y = (int) ((Math.random() * 40) +15);
				
				// oder g2, anders als im Buch?
				g2.fillRect(x, y, höhe, breite);
				msg = false;
			}
		}
		
	}
	
}
