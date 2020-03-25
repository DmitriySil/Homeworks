package Homework.Farm;

public class Wild extends Enimals {
    protected int force;

    public Wild(String name, int weight, int speed, int force) {
        super(name, weight, speed);
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}
