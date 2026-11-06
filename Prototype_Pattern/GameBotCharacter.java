package Prototype_Pattern;
import java.util.*;
public class GameBotCharacter implements Cloneable {
    private String name;
    private int health;
    private int attackPower;
    private List<String> weapons;

    public GameBotCharacter(String name,int health,int attackPower,List<String> weapons){
        // Expensive Operations.....
        System.out.println("Connecting to database");
        System.out.println("Many more Expensive Operation");
        this.name=name;
        this.health=health;
        this.attackPower=attackPower;
        this.weapons=weapons;
    }
    public GameBotCharacter(GameBotCharacter gbc){
        this.name=gbc.name;
        this.health=gbc.health;
        this.attackPower=gbc.attackPower;
        this.weapons=new ArrayList<>(gbc.weapons);
    }
    @Override
    public GameBotCharacter customizedClone() {
        // TODO Auto-generated method stub
        return new GameBotCharacter(this);
    } 
    @Override
public String toString() {
    return "Player{" +
            "name='" + name + '\'' +
            ", health=" + health +
            ", attackPower=" + attackPower +
            ", weapons=" + weapons +
            '}';
}
public String getName() {
    return name;
}
public int getHealth() {
    return health;
}
public int getAttackPower() {
    return attackPower;
}
public List<String> getWeapons() {
    return weapons;
}
public void setName(String name) {
    this.name = name;
}

public void setHealth(int health) {
    this.health = health;
}

public void setAttackPower(int attackPower) {
    this.attackPower = attackPower;
}

}
