package designpattern.singletondesignpattern.billpugh;

public class BillPughSingleton {
	private BillPughSingleton() {
		
	}
	// static inner class
	private static class BillPughSingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return BillPughSingletonHelper.INSTANCE;
	}
}
