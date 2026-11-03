package Factory_Pattern.Abstract_Factory_Pattern;

public interface NotificationsFactory {
    Notifications createNotificationFactory();
    Template createTemplateFactory();
}
