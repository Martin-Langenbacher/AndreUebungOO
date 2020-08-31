package de.markus.session3;

import de.markus.session3.Ball.Builder;

public class Brille {
	
	// Attribute
		private String brillenName;
		private String brillenAdjektiv;
		private String brillenFarbe;
		private String brillenGroesse;
		private double brillenGroesseCm;
		private double preis;
		
		
		// Konstruktor
		public Brille(String brillenName, String brillenAdjektiv, String brillenFarbe, String brillenGroesse, double brillenGroesseCm, double preis) {
			super();
			this.brillenName = brillenName;
			this.brillenAdjektiv = brillenAdjektiv;
			this.brillenFarbe = brillenFarbe;
			this.brillenGroesse = brillenGroesse;
			this.brillenGroesseCm = brillenGroesseCm;
			this.preis = preis;
		}
		
		
		// builder:
		static class Builder {
			
			//// Attribute
			private String brillenName = "Normalo";
			private String brillenAdjektiv = "schöne";
			private String brillenFarbe = "schwarz";
			private String brillenGroesse = "M";
			private double brillenGroesseCm = 16.2;
			private double preis = 59.99;
			
			
			
			// Setter
			public Builder setBrillenName(String brillenName) {
				this.brillenName = brillenName;
				return this;
			}

			public Builder setBrillenAdjektiv(String brillenAdjektiv) {
				this.brillenAdjektiv = brillenAdjektiv;
				return this;
			}

			public Builder setBrillenFarbe(String brillenFarbe) {
				this.brillenFarbe = brillenFarbe;
				return this;
			}

			public Builder setBrillenGroesse(String brillenGroesse) {
				this.brillenGroesse = brillenGroesse;
				return this;
			}

			public Builder setBrillenGroesseCM(double brillenGroesseCm) {
				this.brillenGroesseCm = brillenGroesseCm;
				return this;
			}

			
			public Builder setPreis(double preis) {
				this.preis = preis;
				return this;
			}
			
			
			public Brille build() {
				return new Brille (brillenName, brillenAdjektiv, brillenFarbe, brillenGroesse, brillenGroesseCm, preis);
			}		

		}
		
		
		




		// die normale to String methode kommt aus der Klasse Object!
		@Override
		public String toString() {
			return "Das ist eine sehr " + brillenAdjektiv + " Brille mit dem Namen '" + brillenName + "'. Sie ist " + brillenFarbe + " und ist in der Größe " + brillenGroesse 
					+ " (das entspricht " +brillenGroesseCm + "cm) erhältlich. Sie kostet " + preis +"€.";
		}

}
