package Decorator_Pattern.Example_1;

public class MargheritaPizza implements Pizza {

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "Plain Bread";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return 200;
    }
    
}
