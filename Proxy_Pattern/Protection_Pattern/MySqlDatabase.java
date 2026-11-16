package Proxy_Pattern.Protection_Pattern;

public class MySqlDatabase implements Database {

    @Override
    public void delete() {
        // TODO Auto-generated method stub
       System.out.println("User Deleted");
    }
    
}
