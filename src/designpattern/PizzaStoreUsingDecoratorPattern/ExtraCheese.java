package designpattern.PizzaStoreUsingDecoratorPattern;

public class ExtraCheese extends ToppingDecorator{
    public ExtraCheese(Pizza pizza){
        super(pizza);
    }

    public String getDescription(){
        return pizza.getDescription() + ", extra cheese";
    }

    public double getCost(){
        return pizza.getCost() + 50;
    }
}
