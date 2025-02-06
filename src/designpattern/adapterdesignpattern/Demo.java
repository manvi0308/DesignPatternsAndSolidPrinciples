package designpattern.adapterdesignpattern;

import designpattern.adapterdesignpattern.adapters.SquarePegAdapter;
import designpattern.adapterdesignpattern.round.RoundHole;
import designpattern.adapterdesignpattern.round.RoundPeg;
import designpattern.adapterdesignpattern.square.SquarePeg;

public class Demo {
	public static void main(String[] args) {
		RoundHole rh = new RoundHole(5);
		RoundPeg rp = new RoundPeg(5);
		if(rh.fits(rp)) {
            System.out.println("Round peg r5 fits round hole r5.");
		}
		
		SquarePeg sp = new SquarePeg(2);
		
		SquarePegAdapter smallSqAdapter = new SquarePegAdapter(sp);
		
		if(rh.fits(smallSqAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
		}

	}
}
