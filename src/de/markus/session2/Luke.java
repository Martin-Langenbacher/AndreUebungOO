package de.markus.session2;

public class Luke {
	
	private Darth dad;
	// Klasse Luke benötigt dad um etwas sinnvolles zu machen.
	// Z.B. Methode fight dad, darum benötigt sie dad.

	// getter & setter:
	public void setDad(Darth dad) {
		this.dad = dad;
	}

	public Darth getDad() {
		return dad;
	}
	
	
	// eigentlich Bsp. für dependancy injection... 
	// besser die dependancy in einer unabhängigen Klasse und nicht von einer beteiligten Klasse!
	
}
