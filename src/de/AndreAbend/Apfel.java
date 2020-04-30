package de.AndreAbend;

public class Apfel extends Obst {
	
	private boolean wurm;
	
	public Apfel(String farbe) {
		super("Apfel", farbe);
		this.wurm = false;
	}

	
	
	
	public boolean isWurm() {
		return wurm;
	}

	public void setWurm(boolean wurm) {
		this.wurm = wurm;
	}

	
	public void hatWurm(){
		this.wurm = true;
	}




	@Override
	public void essen() {
		if (wurm) {
			System.out.println("Bähh");
		} else {
			System.out.println("Lecker");
		}
		
	}




	
	
	
}
