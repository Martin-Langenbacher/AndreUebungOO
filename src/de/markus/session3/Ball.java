package de.markus.session3;

public class Ball {
	
	// Attribute
	private String ballName;
	private String ballFarbe;
	private int produktionsJahr;
	private double durchmesserCm;
	
	
	// Konstruktor
	public Ball (String ballName, String ballFarbe, int produktionsJahr, double durchmesserCm) {
		super();
		this.ballName = ballName;
		this.ballFarbe = ballFarbe;
		this.produktionsJahr = produktionsJahr;
		this.durchmesserCm = durchmesserCm;
	}
	
	

	// die normale to String methode kommt aus der Klasse Object!
	@Override
	public String toString() {
		return "Ball: " + ballName + "(" + ballFarbe + "), " + produktionsJahr + ", " + durchmesserCm + "cm.";
	}
	
	
	// builder:
	static class Builder {
		
		//// Attribute
		private String ballName = "EU Fußball";
		private String color = "weiß";
		private int produktionsJahr = 1971;
		private double durchmesserCm = 22.2;
		
		
		
		// Setter
		public Builder setBallName(String ballName) {
			this.ballName = ballName;
			return this;
		}

		public Builder setProduktionsJahr(int produktionsJahr) {
			this.produktionsJahr = produktionsJahr;
			return this;
		}

		public Builder setDurchmesserCm(double durchmesserCm) {
			this.durchmesserCm = durchmesserCm;
			return this;
		}

		
		public Builder setColor(String color) {
			this.color = color;
			return this;
		}

		
		
		public Ball build() {
			return new Ball (ballName, color, produktionsJahr, durchmesserCm);
		}		

	}

}

		
			
	
		
	
	
		

	
		


