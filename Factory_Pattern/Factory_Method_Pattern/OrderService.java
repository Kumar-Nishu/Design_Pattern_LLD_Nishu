package Factory_Pattern.Factory_Method_Pattern;

public class OrderService {
    public static void main(String[] args) {
        NotificationsFactory notificationsFactory = new SmsFactory();
        Notifications notifications = notificationsFactory.createNotificationFactory();
        notifications.SendNotification();

        notificationsFactory = new EmailFactory();
        notifications = notificationsFactory.createNotificationFactory();
        notifications.SendNotification();
    }
}
