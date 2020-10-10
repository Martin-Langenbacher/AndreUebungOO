package de.kopfBisFuss.chapter11;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMiniMusikProg {

	public static void main(String[] args) {
		MiniMiniMusikProg mini = new MiniMiniMusikProg();
		
		int instrument = 102;
		//int instrument = 80;
		//int instrument = 40;
		//int ton = 30;
		//int ton = 20;
		int ton = 70;
		mini.spielen(instrument, ton);
		
		
		/*
		if (args.length < 2) {
			System.out.println("Vergessen Sie nicht Instrument- und Ton-Argument.");
		} else {
			int instrument = Integer.parseInt(args[0]);
			int ton = Integer.parseInt(args[1]);
			mini.spielen(instrument, ton);
		} */
	} // main schließen

	
	public void spielen(int instrument, int ton) {
		try {
			
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			ShortMessage first = new ShortMessage();
			first.setMessage(192,  1, instrument, 0);
			MidiEvent instrumentWechsel = new MidiEvent(first, 1);
			track.add(instrumentWechsel);
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144,  1, ton,  100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128,  1,  ton,  100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			
			player.setSequence(seq);
			
			player.start();
			Thread.sleep(5000);
			System.out.println("after sleep...");
			player.close();
			
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	} // play schließen
} // Klasse schließen
