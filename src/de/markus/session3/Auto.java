package de.markus.session3;

public class Auto {
	
	// Attribute
	private String name;
	private String color;
	private int baujahr;
	private int ps;
	
	
	// Builder als Ersatz für den Konstruktor
	// Konstruktor hat 2 Probleme: 1) ich muss immer alle Parameter setzen 2) Konstruktor, der viele Parameter hat, darf man die Reihenfolge nicht verwechseln (man 
	// verliert den Überblick); ==> bei Bilder kann ich an jeder Stelle das "add-" setzen...
	
	
	
	// Objekt unveränderlich: Dann sollte man es mit builder implementieren, da man danach das Objekt nicht mehr verändern kann (was man will). 
	// --> ich kann das Objekt jederzeit veränder z.b. durch getter & setter
	
	
	// Konstruktor
	private Auto(String name, String color, int baujahr, int ps) {
		super();
		this.name = name;
		this.color = color;
		this.baujahr = baujahr;
		this.ps = ps;
	}
	
	
	// getter - aber keine Setter !
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public int getPs() {
		return ps;
	}
	
	
	
	// die normale to String methode kommt aus der Klasse Object!
	@Override
	public String toString() {
		return "Auto: " + name + "(" + color + "), " + baujahr + ", " + ps + " PS.";
	}



	// builder:
	static class Builder {
		
		// Attribute
		private String name = "Audi";
		private String color = "rot";
		private int baujahr = 2020;
		private int ps = 450;
		
		// Setter
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setColor(String color) {
			this.color = color;
			return this;
		}
		
		public Builder setBaujahr(int baujahr) {
			this.baujahr = baujahr;
			return this;
		}
		
		// fluent API
		public Builder setPs(int ps) {
			this.ps = ps;
			return this;
		}
		
		public Auto build() {
			return new Auto (name, color, baujahr, ps);
		}

	}

}



/*
//Konstruktor-Aufruf? Wann kann ich dies tun? Mit einem Builder?

		mGoogleApiClient = new GoogleApiClient.Builder(this)
             .addApi(Wearable.API)
             .addConnectionCallbacks(this)
             .addOnConnectionFailedListener(this)
             .build();
     mGoogleApiClient.connect();
		*/