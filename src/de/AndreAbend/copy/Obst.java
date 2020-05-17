package de.AndreAbend.copy;

public abstract class Obst implements Essbar{
	
	/* Instanzvariablen */
	String name;
	String farbe;
	
	
	
	/* Konstruktoren */
	public Obst() {
		this("Obst", "Grün");
	}
	
	
	public Obst(String name, String farbe) {
		this.name = name;
		this.farbe = farbe;
	}

	

	/* Getter & Setter */
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFarbe() {
		return farbe;
	}


	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "; Farbe: " +farbe;
	}
	
	
	public abstract void essen();
	

}
