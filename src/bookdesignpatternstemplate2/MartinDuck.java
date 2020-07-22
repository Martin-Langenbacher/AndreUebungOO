package bookdesignpatternstemplate2;

import java.util.Comparator;

public class MartinDuck {
	
	String name;
	int weight;
  
	public MartinDuck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	
	public String toString() {
		return name + ", weighs " + weight;
	}

	
	
	public static Comparator<MartinDuck> MartinDuckNameComparator = new Comparator<MartinDuck>() {

		@Override
		public int compare(MartinDuck duck1, MartinDuck duck2) {
			
			String duckName1 = duck1.getName().toUpperCase();
			String duckName2 = duck2.getName().toUpperCase();
			
			return duckName1.compareTo(duckName2);
		}
		
	};
	
	
	
}
