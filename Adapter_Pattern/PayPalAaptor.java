package Adapter_Pattern;

public class PayPalAaptor implements PaymentService {
     
    private PaypalGateway paypalGateway;
    public PayPalAaptor(PaypalGateway paypalGateway){
        this.paypalGateway=paypalGateway;
    }
    @Override
    public String pay(int amount, int cId) {
        // TODO Auto-generated method stub
        int result=paypalGateway.doTransaction(Double.valueOf(amount), cId);
        if(result==1) return "SUCCESS";
        return "FAILED";
    }
    
}
