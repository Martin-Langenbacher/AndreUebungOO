package bookdesignpatternssigleton;

public class Singleton {
	//private static Singleton uniqueInstance;
	// better ...   ---------------------------------------------> This code is guaranteed to be thread safe!
	private static Singleton uniqueInstance = new Singleton();
	
	// other useful instance variables here
	
	private Singleton() {}
	
	// synchronized is unneeded overhead after we got the instance... decrease performance by a factor of 100
	/*
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	*/
	
	
	// because we got already an instance: WE just return it:
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here 

}
