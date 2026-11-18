package Chain_Of_Resposibility_Pattern;

public class TechTeam implements CustomerSupportHandler {

   
    
    @Override
    public void handleRequest(Issue issue) {
        // TODO Auto-generated method stub
        if(issue.getPriority().equalsIgnoreCase("LEVEL3")){
            // Problem Executing
            System.out.println("Issue Solved by TechTeam");
            issue.setStatus("SUCCESS");
        }
        else{
            issue.setStatus("NOT SOLVED");
            System.out.println("ISSUE COULD'NT SOLVED");
        }
    }
    
}
