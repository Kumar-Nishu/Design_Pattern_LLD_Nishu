package Adapter_Pattern;

public class PaymentClient {
   private PaymentService paymentService;
    public PaymentClient(PaymentService paymentService){
        this.paymentService=paymentService;
    }

   public void makePayment(){
    String result= paymentService.pay(1000,123);
   if(result.equals("SUCCESS")){
    System.out.println("Payement Done Sucessfully ");
   }
   else{
    System.out.println("Payement Failed");
   }
   }
}
