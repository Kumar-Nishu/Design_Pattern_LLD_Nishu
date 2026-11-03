package Factory_Pattern.Simple_Factory_Pattern;

public class Email implements Notifications {
    @Override
    public void SendNotification() {
        System.out.println("Sending Email Notification");
    }
    
}
