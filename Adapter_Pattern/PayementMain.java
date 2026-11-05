package Adapter_Pattern;

public class PayementMain {
    public static void main(String[] args) {
        new PaymentClient(new RazorPayAdopter(new RazorPayGateway())).makePayment();
        new PaymentClient(new PayPalAaptor(new PaypalGateway())).makePayment();
    }
}
