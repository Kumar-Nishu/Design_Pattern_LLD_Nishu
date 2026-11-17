package Decorator_Pattern.Example_1;

public class CheeseDecorator extends PizzaDecorator {
     
    public CheeseDecorator(Pizza pizza){
        super(pizza);
        this.pizza=pizza;
    }
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return pizza.getDescription()+ " Cheese";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return pizza.getCost() + 50;
    }
    
}
