package singletondesignpattern.doublecheckedlocking;


public class Demo extends Thread {
	@Override
	public void run() {
		System.out.println(DoubleCheckedSingleton.getInstance());
	}
public static void main(String[] args) {
	Thread t1 = new Demo();
	Thread t2 = new Demo();
	
	t1.start();
	t2.start();

	
	try {
		t1.join();
		t2.join();
	

	}catch(InterruptedException e){
		e.printStackTrace();
	}
}
}
