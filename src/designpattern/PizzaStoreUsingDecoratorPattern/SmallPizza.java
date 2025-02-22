package designpattern.PizzaStoreUsingDecoratorPattern;

public class SmallPizza implements Pizza{
    @Override
    public String getDescription(){
        return "Small Pizza";
    }

    @Override
    public double getCost() {
        return 50;
    }


}
