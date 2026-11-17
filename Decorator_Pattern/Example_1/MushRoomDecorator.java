package Decorator_Pattern.Example_1;

public class MushRoomDecorator extends PizzaDecorator{
    private Pizza pizza;
    public MushRoomDecorator(Pizza pizza){
        super(pizza);
        this.pizza=pizza;
    }
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return pizza.getDescription()+ " Mushroom";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return pizza.getCost() + 100;
    }
}
