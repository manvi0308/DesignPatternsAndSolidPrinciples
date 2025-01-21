package designpattern.singletondesignpattern.staticblockinitialization;

public class Singleton {
	private static Singleton instance;

	private Singleton() {

	}
	
	static {
		try {
			instance = new Singleton();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
