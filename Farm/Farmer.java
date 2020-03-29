package Homework.Farm;

public class Farmer implements CollectRes {
    protected int resources = 5;


    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public void collectRes(){



    }
    public void eatPet(){

    }
    public void driveAway(){

    }

    public void feed(Pet[] pets){
        for (int i = 0; i < pets.length ; i++) {
            if (pets[i].onFarm){
                pets[i].feed();
            }
        }

    }

    public void eat(){
        resources-=2;
    }


    @Override
    public void collect(GiveResources pet) {
        pet.givRes();
    }
}
