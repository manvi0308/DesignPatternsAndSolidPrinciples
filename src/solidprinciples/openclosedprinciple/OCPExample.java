package solidprinciples.openclosedprinciple;

interface Discount{
	double calculate(double price);
}

class SeasonalDiscount implements Discount{
	@Override
	public double calculate(double price) {
		return price*90;
	}
}

class FestivalDiscount implements Discount{
	@Override
	public double calculate(double price) {
		return price*88;
	}
}
public class OCPExample {
	public static void main(String[] args) {
		Discount seasonal = new SeasonalDiscount();
		Discount festival = new FestivalDiscount();
		System.out.println("Price after seasonal discount  " + seasonal.calculate(1000));
		System.out.println("Price after festival discount  " + festival.calculate(1000));

	}
	
	
}
