package Factory_Pattern.Factory_Method_Pattern;

public class EmailFactory implements NotificationsFactory {
    @Override
    public Notifications createNotificationFactory() {
        return new Email();
    }
    
}
