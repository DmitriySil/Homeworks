package Homework.EnumTasks;
/* Дано
    1.  enum должностей Position,
    2.  класс User со следующими полями:
        String fulName;
        int salary;
        Position position;
    3. несколько массивов, в каждом массиве будут храниться объекты класса User
    с одинаковыми должностями

    Пользователь вводит свои имя, фамилию и первую букву должности.
    Ваша задача создать объект типа User и поместить его в соответствующий массив.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User[] teacher = new User[4];
        User[] programmer = new User[4];
        User[] seller = new User[4];
        User[] doctor = new User[4];
       while (true) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Name");
           String name = scanner.nextLine();
           if (name!=null && !name.equals("stop")) {
               System.out.println("Position");
               String pos = scanner.nextLine();
               if (pos.equals("d")) {
                   User user = new User(name);
                   user.setPosition(Position.DOCTOR);
                   System.out.println(user.getFulName() + " " + user.getPosition());
                   for (int i = 0; i < doctor.length; i++) {
                       if (doctor[i] == null) {
                           doctor[i] = user;
                           break;
                       } } }
               if (pos.equals("t")) {
                   User user = new User(name);
                   user.setPosition(Position.TEACHER);
                   System.out.println(user.getFulName() + " " + user.getPosition());
                   for (int i = 0; i < teacher.length; i++) {
                       if (teacher[i] == null) {
                           teacher[i] = user;
                           break;
                       } } }
               if (pos.equals("stop")){
                   System.out.println("ArrayOfDoctors");
                   for (int i = 0; i < doctor.length; i++){
                       if (doctor[i]!=null){
                           System.out.println(doctor[i].getFulName()+" "+doctor[i].getPosition());
                       } }
                   System.out.println("ArrayOfTeachers");
                   for (int i = 0; i < teacher.length; i++){
                       if (teacher[i]!=null){
                           System.out.println(teacher[i].getFulName()+" "+teacher[i].getPosition());
                       } }
                   break;
               }
           }else if (name.equals("stop")) {
               System.out.println("ArrayOfDoctors");
               for (int i = 0; i < doctor.length; i++){
                   if (doctor[i]!=null){
                       System.out.println(doctor[i].getFulName()+" "+doctor[i].getPosition());
                   }
               }System.out.println("ArrayOfTeachers");
               for (int i = 0; i < teacher.length; i++){
                   if (teacher[i]!=null){
                       System.out.println(teacher[i].getFulName()+" "+teacher[i].getPosition());
                   } }
               break;}
       }


    }
}
enum Position{
    TEACHER,PROGRAMMER,SELLER,DOCTOR;
}
