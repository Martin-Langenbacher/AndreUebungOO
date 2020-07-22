package bookdesignpatternstemplate2;

import java.util.Arrays;

public class MartinTestDuck {

	public static void main(String[] args) {
		
		MartinDuck[] ducks = {
				new MartinDuck("Daffy", 8),
				new MartinDuck("Dewey", 2),
				new MartinDuck("Howard", 7),
				new MartinDuck("Louie", 2),
				new MartinDuck("Martin", 9),
				new MartinDuck("MaDi", 2),
				new MartinDuck("Donald", 10),
				new MartinDuck("Huey", 2),
				new MartinDuck("Arnold", 3)
				};
		
		System.out.println("Before sorting:");
		display(ducks);
		
		
		Arrays.sort(ducks, MartinDuck.MartinDuckNameComparator);
		System.out.println("\nAfter sorting:");
		display(ducks);
		
	}

	
	
	private static void display(MartinDuck[] ducks) {
		for (MartinDuck d : ducks) {
			System.out.println(d);
		}
		
	}

}
