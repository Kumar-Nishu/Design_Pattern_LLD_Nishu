package Factory_Pattern.Simple_Factory_Pattern;

public class Sms implements Notifications {
    @Override
    public void SendNotification() {
        System.out.println("Sending SMS Notification");
    }
}
