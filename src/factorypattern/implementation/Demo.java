package factorypattern.implementation;

class Client{
	private Vehicle vehicle;
	public Client(VehicleFactory factory) {
		vehicle = factory.createVehicle();
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
		Client twoWheelerClient = new Client(twoWheelerFactory);
		
		Vehicle twoWheeler = twoWheelerClient.getVehicle();
		twoWheeler.printVehicle();
		
		
		VehicleFactory fourWheelerFactory = new FourWheelerFactory();
		Client fourWheelerClient = new Client(fourWheelerFactory);
		
		Vehicle fourWheeler = fourWheelerClient.getVehicle();
		fourWheeler.printVehicle();
		
	}

}
