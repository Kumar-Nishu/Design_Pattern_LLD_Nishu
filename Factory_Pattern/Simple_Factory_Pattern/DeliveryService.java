package Factory_Pattern.Simple_Factory_Pattern;

public class DeliveryService {
    public static void main(String[] args) {
        new NotificationsFactory().createNotification("SMS").SendNotification();
        new NotificationsFactory().createNotification("EMAIL").SendNotification();
    }
}
