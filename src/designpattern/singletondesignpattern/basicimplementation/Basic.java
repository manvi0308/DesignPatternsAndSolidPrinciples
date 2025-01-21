package designpattern.singletondesignpattern.basicimplementation;



public class Basic {
	// This approach creates the singleton instance only when it is needed,
// saving resources if the singleton is never used in the application.

	public static void main(String[] args) {
		// The same object will be returned every time
		
		/*
		 * This implementation is not thread-safe. If multiple threads call
		 * getInstance() simultaneously when instance is null, it's possible to create
		 * multiple instances.
		 * 
		 * Showcased in BasicShowingMultipleThreadsCausesIssues.java
		 * 
		 * 
		 */
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());

	}
}
