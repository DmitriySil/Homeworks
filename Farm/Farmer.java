package Homework.Farm;

public class Farmer implements CollectRes {
    protected int resources = 5;


    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public void collectRes(Pet[] pets){
        for (int i = 0; i < pets.length; i++) {
            if (pets[i].onFarm) {
                if (pets[i] instanceof GiveResources) {
                    System.out.println("Фермер собирает ресурсы c " + pets[i].getName());
                    resources += pets[i].getResources();
                }
            }
        }



    }
    public void eatPet(Pet[] pets){
        int countPet = 0;
        for (int i = 0 ; i < pets.length; i++) {
            if (pets[i].onFarm && pets[i] instanceof GiveResources){
                countPet++;
            }
        }
        for (int i = 0; i < pets.length; i++) {
            if (countPet == 0 && pets[i].onFarm && pets[i] instanceof CanEat) {
                resources += pets[i].getHealth();
                System.out.println("Фермер съел " + pets[i].getName());
                pets[i].setOnFarm(false);
            }
        }

    }
    public void driveAway(){

    }

    public void feed(Pet[] pets){
        for (int i = 0; i < pets.length ; i++) {
            if (pets[i].onFarm && pets[i] instanceof CanFeed){
                pets[i].feed();
                System.out.println("Фермер кормит " + pets[i].getName());

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
