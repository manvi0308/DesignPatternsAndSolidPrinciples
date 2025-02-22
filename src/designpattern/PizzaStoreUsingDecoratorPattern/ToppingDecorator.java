package designpattern.PizzaStoreUsingDecoratorPattern;

public abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;
    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){
        return this.pizza.getDescription();
    }

    public double getCost(){
        return this.pizza.getCost();
    }

}
