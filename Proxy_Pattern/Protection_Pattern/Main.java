package Proxy_Pattern.Protection_Pattern;

public class Main {
    public static void main(String[] args) {
        Database db =new DatabaseProxy("ADMIN");
        db.delete();
    }
}
