package DesignPatterns.PrototypePattern;

public class GameCharacter implements Prototype{

    private String type;
    private int health;

    public GameCharacter(String type, int health){
        this.type = type;
        this.health = health;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public Prototype clone() {
        return new GameCharacter(this.type, this.health);
    }
}
