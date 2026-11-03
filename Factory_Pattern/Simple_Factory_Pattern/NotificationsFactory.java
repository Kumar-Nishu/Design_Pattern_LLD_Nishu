package Factory_Pattern.Simple_Factory_Pattern;

public class NotificationsFactory {
    public Notifications createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        if ("SMS".equalsIgnoreCase(channel)) {
            return new Sms();
        } else if ("EMAIL".equalsIgnoreCase(channel)) {
            return new Email();
        }
        throw new IllegalArgumentException("Unknown channel " + channel); 
    }
    
}
