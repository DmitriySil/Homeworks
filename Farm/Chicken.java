package Homework.Farm;

public class Chicken extends Pet implements GiveResources,CanFeed {

    public Chicken(String name, int weight, int speed, int health, int resources, boolean onFarm) {
        super(name, weight, speed, health, resources, onFarm);
    }



    @Override
    public void givRes() {
        getResources();
    }

    @Override
    public void feed() {
        if (health<15){
            health++;
        }
    }
}
