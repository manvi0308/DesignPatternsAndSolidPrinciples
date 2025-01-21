package designpattern.decoratordesignpattern;

public abstract class CoffeeDecorator implements Coffee{
	protected Coffee decoratedCoffee;
	public CoffeeDecorator(Coffee decoratedCoffee) {
		this.decoratedCoffee = decoratedCoffee;
	}
	
	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}
	@Override
	public String getCost() {
		return decoratedCoffee.getCost();
	}
}
