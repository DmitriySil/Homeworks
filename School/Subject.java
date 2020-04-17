package Homework.School;

public class Subject {
    protected String name;
    protected int age;

    public Subject(String name, int age) {
        if (name != null && name.length() >= 2) {
            this.name = name;
        }
        else {
            System.out.println("bad name");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name !=null && name.length()>=2){
            this.name = name; }
            else
            System.out.println("Bad name");
            return;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
