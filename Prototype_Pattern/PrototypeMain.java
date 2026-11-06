package Prototype_Pattern;

import java.util.*;

public class PrototypeMain {
    public static void main(String[] args) {
        GameBotCharacter gbc1=new GameBotCharacter("Nishu", 10, 100,new ArrayList<>(Arrays.asList("Rifle")));
        GameBotCharacter gbc2=gbc1.customizedClone();
        gbc2.setName("Tanish");
        GameBotCharacter gbc3=gbc1.customizedClone();
        gbc3.setHealth(700);
        List<String> w=gbc3.getWeapons();
        w.add("Sword");
        System.out.println("gbc2 created --> " +gbc2.toString());
        System.out.println("gbc1 created --> "+gbc1.toString());
        System.out.println("gbc3 created --> "+gbc3.toString());
        
    }
}
