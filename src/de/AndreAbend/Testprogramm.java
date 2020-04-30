package de.AndreAbend;

public class Testprogramm {
	
	public static void main(String[] args) {
		
		Obst apfel1 = new Apfel("Grün");
		((Apfel) apfel1).setWurm(true);
		Obst apfel2 = new Apfel("Rot");
		Obst birne = new Birne("Birne");
		// Obst obst1 = new Obst(); abstract, dann geht es nicht mehr...!
		Obst obst1 = new Apfel("Lila");
		Essbar obst3 = new Apfel("Orange");
		
		
		Apfel a = new Apfel("Rot");
		a.hatWurm();
		Obst o = new Apfel("Rot");
		
		System.out.println(obst1);
		System.out.println(apfel1 + "\n" + apfel2 + "\n" +birne);
		
		System.out.println("========================> 'apfel1.essen()' <====================");
		apfel1.essen();
		System.out.println("****************************************************************");
		System.out.println(obst3);
		
	}
	
	

}
