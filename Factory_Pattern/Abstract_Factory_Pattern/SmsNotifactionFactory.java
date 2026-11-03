package Factory_Pattern.Abstract_Factory_Pattern;

public class SmsNotifactionFactory implements NotificationsFactory {
    @Override
    public Notifications createNotificationFactory() {
        return new Sms();
    }

    @Override
    public Template createTemplateFactory() {
        return new SmsTemplateFactory();
    }
}
