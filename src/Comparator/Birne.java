package Comparator;

public class Birne extends Obst implements Comparable<Birne>{
	
	/* Instanzvariablen */
	
	private int alter;
	
	/* Konstruktornen */
	
	public Birne(String name, int alter) {
		super(name);
		this.alter = alter;
	}
	
	/* Instanzmethoden */
	
	public int getAlter() {
		return alter;
	}
	
	@Override
	public String toString() {
		return "Birne [alter=" + alter + ", name=" + getName() + "]";
	}
	
	
	// kurze Schreibweise: 
	@Override
	public int compareTo(Birne andereBirne) {
		return this.getAlter() - andereBirne.getAlter();
	} 

	
	/* lange Schreibweise: 
	@Override
	public int compareTo(Birne andereBirne) {
		if(this.getAlter() < andereBirne.getAlter()) {
			return -1;
		}else if (this.getAlter() > andereBirne.getAlter()) {
			return 1;
		} else {
			return 0;
		}
	} */

}
