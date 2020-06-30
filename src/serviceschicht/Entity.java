package serviceschicht;


public class Entity {
	
	private String vorname;
	private String nachname;
	private int alter;

	
	// Constructor
	public Entity(String vorname, String nachname, int alter) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}
	

	//Getter and Setter
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}


	public int getAlter() {
		return alter;
	}


	public void setAlter(int alter) {
		this.alter = alter;
	}
	
}
