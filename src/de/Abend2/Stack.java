package de.Abend2;

public class Stack {
	
	private String[] stapel;
	
	public Stack(int size) {
		this.stapel = new String[5];
	}
	
	
	
	public void push(String s) {
		for (int i = 0; i < stapel.length; i++) {
			if (stapel[i] == null) {
				stapel[i] = s;
				return;
			}
		}
		System.out.println("Der Stack ist schon voll");
	}
	
	
	
	
	public String pop() {
		if (stapel[0] == null) {
			System.out.println("Stapel ist leer.");
			return null;
		}
		return "Stapel ist nicht leer!";
			
		
		
		
	}
	
	
	
	

}




