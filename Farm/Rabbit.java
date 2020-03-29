package Homework.Farm;

public class Rabbit extends Pet implements CanFeed,CanEat {

    public Rabbit(String name, int weight, int speed, int health, int resources, boolean onFarm) {
        super(name, weight, speed, health, resources, onFarm);
    }

    @Override
    public void feed() {
        if (health<20){
            health++;
        }
    }

    @Override
    public void eat() {

    }


}
