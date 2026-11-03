package Factory_Pattern.Factory_Method_Pattern;

public class Sms implements Notifications {
    @Override
    public void SendNotification() {
        System.out.println("Sending SMS Notification");
    }
}
