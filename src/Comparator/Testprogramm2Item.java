package Comparator;

public class Testprogramm2Item {
	
	public static void main(String[] args) {
		
		Item foo2 = new Item("Foo2", 3);
		// Item bar2 = new Item("Bar2", 5);
		Item bar2 = new Item("Xaver2", 5);
		
		int compare = foo2.compareTo(bar2);
		System.out.println(compare);
		System.out.println("Vergeich mit Namen: " + foo2.getName() + " mit " + bar2.getName());
		
		if (compare < 0)
			System.out.println("foo2 is smaller than bar2");
		else if (compare > 0)
			System.out.println("foo2 is greater than bar2");
		else
			System.out.println("foo2 and bar2 is equals");
				
	}

}

