package Prototype_Pattern;

public class GameBotCharacter implements Cloneable {
    private String name;
    private int health;
    private int attackPower;

    public GameBotCharacter(String name,int health,int attackPower){
        // Expensive Operations.....
        System.out.println("Connecting to database");
        System.out.println("Many more Expensive Operation");
        this.name=name;
        this.health=health;
        this.attackPower=attackPower;
    }
    public GameBotCharacter(GameBotCharacter gbc){
        this.name=gbc.name;
        this.health=gbc.health;
        this.attackPower=gbc.attackPower;
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
            '}';
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
