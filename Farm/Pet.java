package Homework.Farm;

public class Pet extends Enimals{

    private int health;
    private int resources;


    public Pet(String name, int weight, int speed, int health, int resources) {
        super(name, weight, speed);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }
}


