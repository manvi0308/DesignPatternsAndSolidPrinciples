package singletondesignpattern.eagerinitialization;

public class EagerSingleton {

	// final prevents from reassignment
	// static ensures can be accessed without creating objects
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
