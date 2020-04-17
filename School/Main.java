package Homework.School;

public class Main {
    public static void main(String[] args) {
        Pupil pup1 = new Pupil("Ivan",12, "Math",8);
        Pupil pup2 = new Pupil("Bob",14, "Phys",3);
        Pupil pup3 = new Pupil("James",14, "Phys",4);
        Pupil pup4 = new Pupil("Eva",11, "Math",10);
        Pupil pup5 = new Pupil("Glasha",17, "CompSci",3);
        Pupil pup6 = new Pupil("Pavel",16, "CompSci",18);

        Teacher teacher1 = new Teacher("Albert", 45, "Phys");
        Teacher teacher2 = new Teacher("Bill", 41, "CompSci");
        Teacher teacher3 = new Teacher("Lubov",44, "Math");

        Director director = new Director("Arkadiy", 25);


        School school = new School(director);
        school.addPup(pup1);
        school.addPup(pup2);
        school.addPup(pup3);
        school.addPup(pup4);
        school.addPup(pup5);
        school.addPup(pup6);

        school.addTech(teacher1);
        school.addTech(teacher2);
        school.addTech(teacher3);

        school.dayAtSchool();



    }

}
