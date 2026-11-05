package Adapter_Pattern;

public class RazorPayAdopter implements PaymentService{
    private RazorPayGateway razorPayGateway;
    public RazorPayAdopter(RazorPayGateway razorPayGateway){
        this.razorPayGateway=razorPayGateway;
    }
    @Override
    public String pay(int amount, int cId) {
        // TODO Auto-generated method stub
        int result=razorPayGateway.doTransaction(Double.valueOf(amount), String.valueOf(cId));
        if(result==1) return "SUCCESS";
        return "FAILED";
    }
    
}
