package bookdesignpatternsadapter;

public class DuckTestDrive {

	public static void main(String[] args) {
		
		// we create a Duck...
		MallardDuck duck = new MallardDuck();
		
		// we create a Turkey...
		WildTurkey turkey = new WildTurkey();
		
		// and then we wrap the 1) the turkey in a TurkeyAdapter, which makes it look like a Duck...
		Duck turkeyAdapter = new TurkeyAdapter (turkey);
		// and 2) the duck in a DuckAdapter, which makes it look like a Turkey...
		Turkey duckAdapter = new DuckAdapter (duck);
		
		
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		
		System.out.println("\nThe Duck says ...");
		testDuck(duck);
		
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
		
		System.out.println("\nThe DuckAdapter says ...");
		testTurkey(duckAdapter);
	}

	
	
	private static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}


	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
