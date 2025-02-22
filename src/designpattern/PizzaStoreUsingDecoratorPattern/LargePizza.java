package designpattern.PizzaStoreUsingDecoratorPattern;

public class LargePizza implements Pizza{

    @Override
    public String getDescription() {
        return "Large Pizza";
    }

    @Override
    public double getCost() {
        return 150;
    }
}
