package bookdesignpatternstemplate2;

import java.util.Comparator;

public class DuckString implements Comparable<DuckString> {
	
	String name;
	int weight;
  
	public DuckString(String name, int weight) {
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

// ==========================================================================================

	public int compareTo(DuckString compareDuck) {
		
		int compareWeight = ((DuckString) compareDuck).getWeight();
		// ascending order
		return this.weight - compareWeight;
	}
	
// ==========================================================================================
	

	public static Comparator<DuckString> DuckStringComparator = new Comparator<DuckString>() {

		public int compare(DuckString duck1, DuckString duck2) {
			
			String duckName1 = duck1.getName().toUpperCase();
			String duckName2 = duck2.getName().toUpperCase();
			return duckName1.compareTo(duckName2);
		}
		
	};

}
