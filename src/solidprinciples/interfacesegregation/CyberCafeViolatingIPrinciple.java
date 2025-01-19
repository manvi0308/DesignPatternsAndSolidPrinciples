package solidprinciples.interfacesegregation;

interface Printer{
	void print();
}

interface Advanced{
	/*
	 * This code violates the Interface Segregation Principle (ISP) because the
	 * Advanced interface combines multiple unrelated functionalities (coloredPrint,
	 * scan, copy) into one interface. As a result:
	 * 
	 * Violation Explanation: The BasicPrinter class does not need functionalities
	 * like coloredPrint, scan, or copy, but it is forced to implement these methods
	 * if it wants to implement Advanced. This creates unnecessary dependency on
	 * methods it doesn't use, which goes against ISP.
	 * 
	 * Why it’s a problem: If, in the future, we add more advanced features (e.g.,
	 * fax or email), every printer class implementing Advanced will be forced to
	 * either implement those features or leave them empty, leading to bloated or
	 * partially implemented interfaces.
	 * 
	 * 
	 */
	void coloredPrint();
	void scan();
	void copy();
}


class BasicPrinter implements Printer {
	@Override
	public void print() {
		System.out.println("Printing using basic printer");
	}
}

class AdvancedPrinter implements Printer, Advanced{
	@Override
	public void print() {
		System.out.println("Printing using basic printer");
	}
	@Override
	public void coloredPrint() {
		System.out.println("Colored printing using advanced printer");

	}
	
	@Override
	public void scan() {
		System.out.println("Scanning using advanced printer");

	}

	@Override
	public void copy() {
		System.out.println("Copying using advanced printer");

	}

}

class SpecialPrinter {
	// formatting
	// editing
	
}
public class CyberCafeViolatingIPrinciple {

}
