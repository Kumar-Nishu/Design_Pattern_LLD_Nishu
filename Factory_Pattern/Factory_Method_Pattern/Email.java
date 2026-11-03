package Factory_Pattern.Factory_Method_Pattern;

public class Email implements Notifications {
     @Override
    public void SendNotification() {
        System.out.println("Sending Email Notification");
    }
}
