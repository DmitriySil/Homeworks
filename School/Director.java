package Homework.School;

public class Director extends Subject {


    public Director(String name, int age) {
        super(name, age);
    }

    public void start (){
        System.out.println("Director " + getName() + " Said start");


    }
    public void end (){
        System.out.println("Director " + getName() + " Said STOP");
    }
}
