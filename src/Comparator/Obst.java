package Comparator;

public class Obst {
	
	// es gibt bereits ein Interface und wir verpflichten uns dazu dies umzusetzen...
	
	
	
	/* Instanzvariablen */
	
	private String name;
	
	
	
	/* Konstruktoren */
	
	public Obst(String name) {
		// super();   ----> automatisch drin...
		this.name = name;
	}
	
	
	
	/* Instanzmethoden */
	
	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return "Obst [name=" + name + "]";
	}


/*
	@Override
	public int compareTo(Obst o) {
		return this.getName().compareTo(o.getName());
	}
	*/
	
	
	

}
