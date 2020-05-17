package Comparator;

public class Apfel extends Obst implements Comparable<Apfel> {
	
	/* Instanzvariablen */
	
	private int haltbarkeit;
	
	/* Konstruktornen */
	
	public Apfel(String name, int haltbarkeit) {
		super(name);
		this.haltbarkeit = haltbarkeit;
	}
	
	/* Instanzmethoden */
	
	public int getHaltbarkeit() {
		return haltbarkeit;
	}
	
	@Override
	public String toString() {
		return "Apfel [haltbarkeit=" + haltbarkeit + ", name=" + getName() + "]";
	}

	
	@Override
	public int compareTo(Apfel andererApfel) {
		if(this.getHaltbarkeit() < andererApfel.getHaltbarkeit()) {
			return -1;
		}else if (this.getHaltbarkeit() > andererApfel.getHaltbarkeit()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
	
	
	
	

}
