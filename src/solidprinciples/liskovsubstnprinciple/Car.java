package solidprinciples.liskovsubstnprinciple;

public class Car extends EngineVehicle {
	@Override
	public int returnWheels() {
		return 4;
	}
}
