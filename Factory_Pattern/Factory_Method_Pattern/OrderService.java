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



// We move from Factory Method Pattern to Abstract Factory Pattern when our object creation requirements become more complex.
//The main reason is that Factory Method focuses on creating one type of product, whereas Abstract Factory focuses on creating families of related products.
