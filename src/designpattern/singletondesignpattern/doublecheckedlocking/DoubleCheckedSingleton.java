package designpattern.singletondesignpattern.doublecheckedlocking;


public class DoubleCheckedSingleton {
	// all thread will see the same value for instance
	private static volatile DoubleCheckedSingleton instance;
	private DoubleCheckedSingleton() {
		System.out.println("DoubleCheckedSingleton is instantiated");
	}
	
	// do not use synchronized only when demonstrating that multiple threads causes
	// issues
	static DoubleCheckedSingleton getInstance() {
		if (instance == null) {
			// synchrozing on the class object
			synchronized (DoubleCheckedSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedSingleton();
				}
			}
		}
		return instance;
	}
}
