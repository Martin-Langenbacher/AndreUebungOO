package bookdesignpatternssigleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	// part of Singleton Pattern
	private static ChocolateBoiler uniqueInstance;
	
	// Singleton: here is private needed !!! (before public)
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	// Singleton Pattern <<<=============================================================================
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	// Singleton Pattern =======================================================>>> END <<<==============
	
	
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain (entleeren) the boiled milk and chocolate
			empty = true;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}

	private boolean isBoiled() {
		return boiled;
	}

	private boolean isEmpty() {
		return empty;
	}
	
	
}
