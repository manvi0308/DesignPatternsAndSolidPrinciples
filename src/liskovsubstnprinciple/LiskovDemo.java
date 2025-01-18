package liskovsubstnprinciple;
import java.util.*;

public class LiskovDemo {
	public static void main(String[] args) {
		ArrayList<Vehicle> al = new ArrayList<>();
		al.add(new Bike());
		al.add(new Car());
		al.add(new Cycle());
		// this code is somehow affecting the correctness of a program, because in 
		// cycle class the hasEngine method is returning Null
		// so the client side code will break here
		al.add(new Cycle()); 
		for(Vehicle veh : al) {
			System.out.println(veh.returnWheels());
		}

	}

}
