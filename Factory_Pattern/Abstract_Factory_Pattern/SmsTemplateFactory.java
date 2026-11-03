package Factory_Pattern.Abstract_Factory_Pattern;

public class SmsTemplateFactory implements Template {
    @Override
    public void TemplateMethod() {
        System.out.println("SMS Template");
        
    }
    
}
