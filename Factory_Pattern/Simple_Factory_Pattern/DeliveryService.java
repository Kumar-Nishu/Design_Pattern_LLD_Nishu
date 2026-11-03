package Factory_Pattern.Simple_Factory_Pattern;

public class DeliveryService {
    public static void main(String[] args) {
        new NotificationsFactory().createNotification("SMS").SendNotification();
        new NotificationsFactory().createNotification("EMAIL").SendNotification();
    }
}


// Now DeliveryService class is using the NotificationsFactory to create instances of Sms and Email classes based on the provided channel. 
// It then calls the SendNotification method on those instances to send the respective notifications.

// ------------------------Disdavantages of Simple Factory Pattern------------------------
// 1. Violation of Open/Closed Principle: The Simple Factory Pattern violates the Open/Closed Principle, which states that software entities should be open for extension but closed for modification.  
//     If a new notification type needs to be added, the factory class must be modified, which can lead to code changes in multiple places and potential bugs.


// This Disadvantage can be mitigated by using the Factory Method Pattern or Abstract Factory Pattern, which allow for easier extension of new notification types without modifying existing code.