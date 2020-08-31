package de.markus.session3;

import de.markus.session3.Auto.Builder;

public class TestTheBuilder {

	public static void main(String[] args) {
		
		
		Builder builder = new Auto.Builder();
		
		builder.setBaujahr(2020);
		builder.setColor("red");
		Auto auto = builder.build();
	
		
		
		Auto auto2 = new Auto.Builder().setBaujahr(2019).setColor("green").setName("Mercedes").build();
		Auto auto3 = new Auto.Builder().setBaujahr(1999).setColor("yellow").setName("Audi A3").setPs(199).build();
		Auto auto4 = new Auto.Builder().setBaujahr(1998).setColor("orange").setName("Audi A6").setPs(251).build();
		
		Ball ball2 = new Ball.Builder().setBallName("Kinderball").build();
		Ball ball3 = new Ball.Builder().setBallName("Babyball").build();
		Ball ball1 = new Ball.Builder().setProduktionsJahr(2018).setColor("white").setBallName("Fußball").setDurchmesserCm(15.5).build();
		
		Brille brille1 = new Brille.Builder().setBrillenName("Dunkler Sommer").setBrillenAdjektiv("geschmeidige").setPreis(133.33).build();
		Brille brille2 = new Brille.Builder().setBrillenName("Bonze").setBrillenAdjektiv("auffällige").setPreis(933.33).build();
		Brille brille3 = new Brille.Builder().setBrillenName("Kindertraum").setBrillenFarbe("bunte").setBrillenGroesse("S").setBrillenGroesseCM(9.1).setBrillenAdjektiv("dezent").setBrillenFarbe("braun").setPreis(29.49).build();
		Brille brille4 = new Brille.Builder().setBrillenFarbe("pink").build();
		Brille brille5 = new Brille.Builder().build();
		
		System.out.println(auto);
		System.out.println(auto2);
		System.out.println(auto3);
		System.out.println(auto4);
		
		System.out.println("\n" + ball1);
		System.out.println(ball2);
		System.out.println(ball3);
		
		System.out.println("\n" + brille1);
		System.out.println(brille2);
		System.out.println(brille3);
		System.out.println(brille4);
		System.out.println(brille5);
	}
	
}
