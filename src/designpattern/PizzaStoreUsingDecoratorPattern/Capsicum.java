package designpattern.PizzaStoreUsingDecoratorPattern;

public class Capsicum extends ToppingDecorator{
    public Capsicum(Pizza pizza){
        super(pizza);
    }

    public String getDescription(){
        return pizza.getDescription() + ", capsicum";
    }

    public double getCost(){
        return pizza.getCost() + 20;
    }
}
