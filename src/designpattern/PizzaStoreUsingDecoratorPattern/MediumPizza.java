package designpattern.PizzaStoreUsingDecoratorPattern;

public class MediumPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Medium Pizza";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
