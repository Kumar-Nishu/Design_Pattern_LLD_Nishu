package Factory_Pattern.Factory_Method_Pattern;

public class SmsFactory implements NotificationsFactory {
    @Override
    public Notifications createNotificationFactory() {
        return new Sms();
    }
}
