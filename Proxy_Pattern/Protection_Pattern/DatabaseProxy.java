package Proxy_Pattern.Protection_Pattern;

public class DatabaseProxy implements Database {
    private Database db;
    private  String role;

   public DatabaseProxy(String role){
    this.db=new MySqlDatabase();
    this.role=role;
   }

   @Override
   public void delete() {
    // TODO Auto-generated method stub
    if(role.equalsIgnoreCase("ADMIN")) db.delete();
    else System.out.println("Access has been denied");
   }
}
