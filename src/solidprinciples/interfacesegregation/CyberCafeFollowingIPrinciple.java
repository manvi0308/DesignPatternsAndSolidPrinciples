package solidprinciples.interfacesegregation;
interface PrinterTwo{
	void print();
}
// Breaking the advanced interface into smaller manageable chunks
// Separate interface for coloredprinting, scan and photocopys - ALSO FOLLOWING THE SINGLE
// RESPONSIBILTY PRINCIPLE
interface ColoredPrint{
	void coloredPrint();
}

interface Scan{
	void scan();
}

interface photoCopy{
	void photocopy();
}

// Simple interface that is only implementing one interface
class BasicPrinter2 implements PrinterTwo {
	@Override
	public void print() {
		System.out.println("Printing using basic printer");
	}
}



class AdvancedPrinter2 implements PrinterTwo, ColoredPrint, Scan {
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

}

class AdvancedPrinter3 implements PrinterTwo, Scan {
	@Override
	public void print() {
		System.out.println("Printing using basic printer");
	}

	@Override
	public void scan() {
		System.out.println("Scanning using advanced printer");

	}

}



public class CyberCafeFollowingIPrinciple {

}
