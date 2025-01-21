package designpattern.factorypattern;

abstract class Vehicle{
	public abstract void printVehicle();
}

class TwoWheeler extends Vehicle{
	@Override
	public  void printVehicle() {
		System.out.println("Two wheeler");
	}

}
class FourWheeler extends Vehicle{
	@Override
	public  void printVehicle() {
		System.out.println("Four wheeler");
	}

}

class Client{
	private Vehicle vehicle;
	public Client(int type) {
		if(type == 1) {
			vehicle = new TwoWheeler();
		}
		else if(type == 2) {
			vehicle = new FourWheeler();
		}
		else {
			vehicle = null;
		}
	}
	
	public void cleanUp() {
		if(vehicle != null)
			vehicle = null;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
}



public class WithoutFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client pclient = new Client(1);
		Vehicle pvehicle = pclient.getVehicle();
		if(pvehicle != null) {
			pvehicle.printVehicle();
		}
		pclient.cleanUp();

	}

}
