package Factory_Pattern.Abstract_Factory_Pattern;

public class OrderService {
    public static void main(String[] args) {
        NotificationsFactory notificationsFactory = new SmsNotifactionFactory();
        Notifications notifications = notificationsFactory.createNotificationFactory();
        notifications.SendNotification();
        Template template = notificationsFactory.createTemplateFactory();
        template.TemplateMethod();

        notificationsFactory = new EmailNotificationFactory();
        notifications = notificationsFactory.createNotificationFactory();
        notifications.SendNotification();
        template = notificationsFactory.createTemplateFactory();
        template.TemplateMethod();
    }
}
