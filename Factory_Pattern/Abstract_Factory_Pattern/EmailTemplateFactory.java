package Factory_Pattern.Abstract_Factory_Pattern;

public class EmailTemplateFactory implements Template {
    @Override
    public void TemplateMethod() {
        System.out.println("Email Template");
        
    }
    
}
