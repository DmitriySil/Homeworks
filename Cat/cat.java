package Homework.Cat;

public class cat {
    String name;
    int weight;
    int age;
    String colour;
    String ownerAdress;
    int hp;
    int power;

    public cat(String name, String colour){
       setName(name);
       setColour(colour);
    }

        public cat(int hp, String ownerAdress, int power){
        setHp(hp);
        setOwnerAdress(ownerAdress);
        setPower(power);

        }

        public cat(){

    }


    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (name != null &&name.length()>3)
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwnerAdress() {
        return ownerAdress;
    }

    public void setOwnerAdress(String ownerAdress) {
        this.ownerAdress = ownerAdress;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void printInfo(){
        System.out.println("Инф о коте" + getName());

    }

    public void fightCat(cat enemyCat){
        hp -= enemyCat.getPower();

    }
}

