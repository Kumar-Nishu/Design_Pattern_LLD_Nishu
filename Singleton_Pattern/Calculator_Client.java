package Singleton_Pattern;

public class Calculator_Client {
    public static void main(String[] args) {
        Calculator C1=Calculator.getInstance();
        C1.a=10;
        C1.b=70;
        System.out.print(C1.sum());
    }
}
