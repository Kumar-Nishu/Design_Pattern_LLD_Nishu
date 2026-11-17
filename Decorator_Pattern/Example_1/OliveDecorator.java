package Decorator_Pattern.Example_1;

public class OliveDecorator extends PizzaDecorator{
     Pizza pizza;
    public OliveDecorator(Pizza pizza){
        super(pizza);
        this.pizza=pizza;
    }
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return pizza.getDescription()+ " Olive";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return pizza.getCost() + 70;
    }
}
