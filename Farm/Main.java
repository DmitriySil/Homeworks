package Homework.Farm;

public class Main {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        Pet pet1 = new Cat("Cat", 3, 17, 30, 0, true);
        Pet pet2 = new Cow("Cow", 100, 14, 120, 1, true);
        Pet pet3 = new Cow("Cow", 120, 14, 120, 1, true);
        Pet pet4 = new Chicken("Chicken", 2, 19, 15, 1, true);
        Pet pet5 = new Chicken("Chicken", 2, 15, 15, 1, true);
        Pet pet6 = new Chicken("Chicken", 2, 13, 15, 1, true);
        Pet pet7 = new Chicken("Chicken", 2, 14, 15, 1, true);
        Pet pet8 = new Rabbit("Rabbit", 3, 10, 20, 0, true);
        Pet pet9 = new Rabbit("Rabbit", 3, 10, 20, 0, true);
        Pet pet10 = new Rabbit("Rabbit", 3, 10, 20, 0, true);

        Wild wild1 = new Wolf("Wolf", 100, 20, 25, true);
        Wild wild2 = new Fox("Fox", 10, 18, 19, true);
        Wild wild3 = new Bear("Bear", 200, 15, 100, true);
        Wild wild4 = new Bear("Bear", 200, 15, 130, true);
        Wild wild5 = new Fox("Fox", 200, 18, 130, true);


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

        farm.addWild(wild1);
        farm.addWild(wild2);
        farm.addWild(wild3);
        farm.addWild(wild4);
        farm.addWild(wild5);

        farm.passDay();
    }
}
