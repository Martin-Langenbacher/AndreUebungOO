package bookdesignpatternssigleton;

public class SingletonVolatile {
	private volatile static SingletonVolatile uniqueInstance;
	
	private SingletonVolatile () {}
	
	public static SingletonVolatile getInstance() {
		synchronized (SingletonVolatile.class) {
			if (uniqueInstance == null) {
				uniqueInstance = new SingletonVolatile();
			}	
		}
		return uniqueInstance;	
	}
}

