package solidprinciples.liskovsubstnprinciple;

public class Vehicle {
	public int returnWheels() {
		return 2;
	}

	/*
	 * We have removed this method from here and moved to EngineVehicle class, the objective
	 * is to have very generic methods in Vehicle class.
	 * public Boolean hasEngine() { return true; }
	 */

}
