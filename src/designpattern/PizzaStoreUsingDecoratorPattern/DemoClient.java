package designpattern.PizzaStoreUsingDecoratorPattern;

public class DemoClient {
    public static void main(String[] args) {
        Pizza pizza = new SmallPizza();
        pizza = new Capsicum(pizza);
        pizza = new ExtraCheese(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
