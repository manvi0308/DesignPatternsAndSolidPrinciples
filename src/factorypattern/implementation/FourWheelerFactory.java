package factorypattern.implementation;

public class FourWheelerFactory implements VehicleFactory {

	public Vehicle createVehicle() {
		return new FourWheeler();
	}
}
