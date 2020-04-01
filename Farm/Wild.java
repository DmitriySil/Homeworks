package Homework.Farm;

public class Wild extends Enimals {
    protected int force;
    protected boolean onFarm;

    public Wild(String name, int weight, int speed, int force, boolean onFarm) {
        super(name, weight, speed);
        this.force = force;
        this.onFarm = onFarm;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public boolean isOnFarm() {
        return onFarm;
    }

    public void setOnFarm(boolean onFarm) {
        this.onFarm = onFarm;
    }

    public void seekAndDestroy(Pet pets){
        System.out.println(getName() + " Съел "+pets.getName());
        pets.setOnFarm(false);
    }
}