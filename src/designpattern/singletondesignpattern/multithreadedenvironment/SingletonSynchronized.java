package designpattern.singletondesignpattern.multithreadedenvironment;

public class SingletonSynchronized {
	private static SingletonSynchronized instance;
	private SingletonSynchronized() {
		System.out.println("Singleton is instantiated");
	}
	
	// But, using synchronized can decrease performance, which can be a bottleneck if called frequently.


	static  synchronized SingletonSynchronized getInstance() {
		if (instance == null) {
			instance = new SingletonSynchronized();
		}
		return instance;
	}
}
