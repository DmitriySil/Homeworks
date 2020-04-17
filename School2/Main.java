package Homework.School2;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setAge(44);
        teacher.setSubject("Химия");
        Schoolboy schoolboy = new Schoolboy();
        schoolboy.setAge(7);
        schoolboy.setSubject("Химия");

        Schoolboy schoolboy1 = new Schoolboy();
        schoolboy1.setAge(7);
        schoolboy1.setSubject("Физра");

        Director director = new Director();
        director.setAge(66);

        School school = new School("344", director);

        school.addPTeacher(teacher);
        school.addPupil(schoolboy);
        school.addPupil(schoolboy1);

        school.dayAtSchool();
    }
}
