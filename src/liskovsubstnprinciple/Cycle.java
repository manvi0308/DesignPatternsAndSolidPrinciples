package liskovsubstnprinciple;

public class Cycle extends Vehicle{
	// now in cycle class we are changing the default behaviour of hasEngine in vehicle 
	// class, the code is fine here
	public Boolean hasEngine() {
		return null;
	}
}
