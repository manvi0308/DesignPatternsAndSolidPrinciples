package designpattern.decoratordesignpattern;

public class PlainCoffee implements Coffee {
	@Override
	public String getDescription() {
		return "Plain Coffee";
	}
	@Override
	public String getCost() {
		return "2.0";
	}
}
