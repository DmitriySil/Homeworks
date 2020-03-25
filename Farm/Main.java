package Homework.Farm;

public class Main {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Pet pet1 = new Cat("Cat", 3, 20, 30, 0);
        Pet pet2 = new Cow("Cow", 100, 15, 100, 2);
        Pet pet3 = new Cow("Cow", 120, 16, 120, 3);
        Pet pet4 = new Chicken("Chicken", 2, 16, 15, 1);
        Pet pet5 = new Chicken("Chicken", 2, 15, 15, 1);
        Pet pet6 = new Chicken("Chicken", 2, 15, 15, 1);
        Pet pet7 = new Chicken("Chicken", 2, 15, 15, 1);
        Pet pet8 = new Rabbit("Rabbit", 3, 10, 20, 0);
        Pet pet9 = new Rabbit("Rabbit", 3, 10, 20, 0);
        Pet pet10 = new Rabbit("Rabbit", 3, 10, 20, 0);




        Farm farm = new Farm(farmer);
        farm.addPet(pet1);
        farm.addPet(pet2);
        farm.addPet(pet3);
        farm.addPet(pet4);
        farm.addPet(pet5);
        farm.addPet(pet6);
        farm.addPet(pet7);
        farm.addPet(pet8);
        farm.addPet(pet9);
        farm.addPet(pet10);
        farm.passDay();
    }
}
