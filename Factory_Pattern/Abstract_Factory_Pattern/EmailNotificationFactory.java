package Factory_Pattern.Abstract_Factory_Pattern;

public class EmailNotificationFactory implements NotificationsFactory {
    @Override
    public Notifications createNotificationFactory() {
        return new Email();
    }
    @Override
    public Template createTemplateFactory() {
        return new EmailTemplateFactory();
    }
}
