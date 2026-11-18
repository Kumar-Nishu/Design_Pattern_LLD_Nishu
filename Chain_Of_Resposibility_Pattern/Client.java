package Chain_Of_Resposibility_Pattern;

public class Client {
    private CustomerSupportHandler handler;
    public Client(){
        handler=new Chatbot();
    }
    public void raiseIssue(Issue issue){
        handler.handleRequest(issue);
    }
}
