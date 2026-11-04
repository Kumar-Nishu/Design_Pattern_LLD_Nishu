package Builder_Pattern;

public class LoginService {
    public static void main(String[] args) {
        User us=new User.UserBuilder()
                .setName("Nishu")
                .setAge(23)
                .setCity("Pune")
                .setEmail("Nishu@gmail.com")
                .Build();
                System.out.println("Registered User : "+us);
    }
    
}
