package Decorator_Pattern.Example_1;

public abstract class PizzaDecorator implements Pizza {
    Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
}
