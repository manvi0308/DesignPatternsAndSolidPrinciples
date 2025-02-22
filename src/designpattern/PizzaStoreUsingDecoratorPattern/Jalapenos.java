package designpattern.PizzaStoreUsingDecoratorPattern;

public class Jalapenos extends ToppingDecorator {
    public Jalapenos(Pizza pizza){
        super(pizza);
    }

    public String getDescription(){
        return pizza.getDescription() + ", with jalapenos";
    }

    public double getCost(){
        return pizza.getCost() + 150;
    }
}
