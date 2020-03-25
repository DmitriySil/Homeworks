package Homework.Farm;

public class Farm {
    protected Pet[] pets = new Pet[10];
    protected Farmer farmer;

    public Farm(Farmer farmer) {
        this.farmer = farmer;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public void addPet (Pet newPet){
        for (int i = 0; i < pets.length ; i++) {
            if (pets[i] == null){
                pets[i] = newPet;
                break;
            }

        }
    }

    public void passDay(){

        System.out.println(farmer.getResources());
        while (true){
            System.out.println(farmer.getResources());
        if (farmer.getResources() >= 2) {
            farmer.eat();
            farmer.feed();
            farmer.collectRes();
            if (){
                farmer.eatPet();
            }

        }
        else {
            System.out.println("The Farmer DIED");
            return;}
        }
    }
}
