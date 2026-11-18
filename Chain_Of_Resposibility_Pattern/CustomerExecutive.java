package Chain_Of_Resposibility_Pattern;

public class CustomerExecutive implements CustomerSupportHandler{

    private CustomerSupportHandler customerSupportHandler;
    public CustomerExecutive(){
        this.customerSupportHandler=new TechTeam();
    }
    @Override
    public void handleRequest(Issue issue) {
        // TODO Auto-generated method stub
        if(issue.getPriority().equalsIgnoreCase("LEVEL2")){
            // Problem Executing
            System.out.println("Issue Solved by CustomerExecutive");
            issue.setStatus("SUCCESS");
        }
        else{
            issue.setStatus("PENDING");
            customerSupportHandler.handleRequest(issue);
        }
    }
    
}
