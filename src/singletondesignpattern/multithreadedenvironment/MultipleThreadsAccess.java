package singletondesignpattern.multithreadedenvironment;

public class MultipleThreadsAccess extends Thread {
	// UNCOMMENT WHEN SHOWCASING PROBLEMS WITH MULTIPLE INSTANCES
	//@Override
	//public void run() {
	//	System.out.println(Singleton.getInstance());
	// }
	@Override
	public void run() {
		System.out.println(SingletonSynchronized.getInstance());
	}
	
	
	public static void main(String[] args) {
		
		// This approach will create multiple instances of singleton class which
		// is not desirable
		
		// Solution is to use synchronized keyword, that makes the program
		// thread safe ensuring only one thread can access it a time.
		Thread t1 = new MultipleThreadsAccess();
		Thread t2 = new MultipleThreadsAccess();
		Thread t3 = new MultipleThreadsAccess();
		Thread t4 = new MultipleThreadsAccess();
		Thread t5 = new MultipleThreadsAccess();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();

		}catch(InterruptedException e){
			e.printStackTrace();
		}

		

	}
}
