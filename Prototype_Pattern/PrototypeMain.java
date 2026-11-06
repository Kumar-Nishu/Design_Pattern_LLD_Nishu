package Prototype_Pattern;

public class PrototypeMain {
    public static void main(String[] args) {
        GameBotCharacter gbc1=new GameBotCharacter("Nishu", 10, 100);
        System.out.println("gbc1 created --> "+gbc1.toString());

        GameBotCharacter gbc2=gbc1.customizedClone();
        gbc2.setName("Tanish");
        System.out.println("gbc2 created --> " +gbc2.toString());
        gbc2.toString();
        GameBotCharacter gbc3=gbc1.customizedClone();
        gbc3.setHealth(700);
        System.out.println("gbc3 created --> "+gbc3.toString());
        gbc3.toString();
    }
}
