package Homework.Farm;

public class Pet extends Enimals implements CanFeed {

    protected int health;
    protected int resources;
    protected boolean onFarm = true;

    public Pet(String name, int weight, int speed, int health, int resources, boolean onFarm) {
        super(name, weight, speed);
        this.health = health;
        this.resources = resources;
        this.onFarm = onFarm;
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

    public boolean isOnFarm() {
        return onFarm;
    }

    public void setOnFarm(boolean onFarm) {
        this.onFarm = onFarm;
    }

    @Override
    public void feed() {


        }
    }





