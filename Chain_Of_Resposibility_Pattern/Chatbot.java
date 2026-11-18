package Chain_Of_Resposibility_Pattern;

public class Chatbot implements CustomerSupportHandler {
    private CustomerSupportHandler customerSupportHandler;
    public Chatbot(){
        this.customerSupportHandler=new CustomerExecutive();
    }
    @Override
    public void handleRequest(Issue issue) {
        // TODO Auto-generated method stub
        if(issue.getPriority().equalsIgnoreCase("LEVEL1")){
            // Problem Executing
            System.out.println("Issue Solved by ChatBot");
            issue.setStatus("SUCCESS");
        }
        else{
            issue.setStatus("PENDING");
            customerSupportHandler.handleRequest(issue);
        }
    }
    
}
