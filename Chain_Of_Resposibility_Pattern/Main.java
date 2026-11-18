package Chain_Of_Resposibility_Pattern;

public class Main {
    public static void main(String[] args) {
        Issue issue=new Issue("LEVEL3", "RAISED_REQUEST");
        Client C1=new Client();
        C1.raiseIssue(issue);
    }
}
