package designpattern.singletondesignpattern.basicimplementation;

public class Singleton {
		private static Singleton instance;
		private Singleton() {
			System.out.println("Singleton is instantiated");
		}
		
		// do not use synchronized only when demonstrating that multiple threads causes issues
		static  Singleton getInstance() {
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
	}

