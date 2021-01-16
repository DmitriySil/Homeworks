package Homework.stream;

import ru.ifmo.base.lesson22.Employee;
import ru.ifmo.base.lesson22.User;
import sun.applet.resources.MsgAppletViewer;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PupilTask {
    public static void main(String[] args) {
        // ображение к enum Gender через имя класса - Pupil.Gender

        // Используя Stream API:

        // +1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Pupil.Gender, ArrayList<Pupil>>

        // 2. Найти средний возраст учеников

        // +3. Найти самого младшего ученика

        // +4. Найти самого старшего ученика

        // +5. Собрать учеников в группы по году рождения

        // +6. Убрать учеников с одинаковыми именами, имена и дату рождения оставшихся вывести в консоль

        // 7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)

        // 8. Вывести в косоль всех учеников в возрасте от N до M лет

        // 9. Собрать в список всех учеников с именем=someName

        // 10. Собрать Map<Pupil.Gender, Integer>, где Pupil.Gender - пол, Integer - суммарный возраст учеников данного пола

        ArrayList<Pupil> pupils = new ArrayList<>();
        pupils.add(new Pupil(1,"Bob", Pupil.Gender.MALE,LocalDate.of(2010,12,10)));
        pupils.add(new Pupil(14,"Bob", Pupil.Gender.MALE,LocalDate.of(2010,12,10)));
        pupils.add(new Pupil(15,"Bob", Pupil.Gender.MALE,LocalDate.of(2010,12,10)));
        pupils.add(new Pupil(2,"Rob", Pupil.Gender.MALE, LocalDate.of(2010,2,2)));
        pupils.add(new Pupil(3,"Bill", Pupil.Gender.MALE, LocalDate.of(2010,11,23)));
        pupils.add(new Pupil(4,"Bud", Pupil.Gender.MALE, LocalDate.of(2012,10,14)));
        pupils.add(new Pupil(5,"Jim", Pupil.Gender.MALE, LocalDate.of(2012,4,5)));
        pupils.add( new Pupil(6,"Butch", Pupil.Gender.MALE, LocalDate.of(2010,4,12)));
        pupils.add(new Pupil(7,"Katy", Pupil.Gender.FEMALE, LocalDate.of(2014,11,10)));
        pupils.add(new Pupil(17,"Katy", Pupil.Gender.FEMALE, LocalDate.of(2014,11,10)));
        pupils.add(new Pupil(8,"Jeny", Pupil.Gender.FEMALE, LocalDate.of(2014,12,25)));
        pupils.add(new Pupil(9,"Sara", Pupil.Gender.FEMALE, LocalDate.of(2010,3,19)));
        pupils.add(new Pupil(10,"Holy", Pupil.Gender.FEMALE, LocalDate.of(2014,3,20)));
        pupils.add(new Pupil(11,"Dolly", Pupil.Gender.FEMALE, LocalDate.of(2010,12,17)));
        pupils.add(new Pupil(12,"Megan", Pupil.Gender.FEMALE, LocalDate.of(2013,7,17)));
        pupils.add(new Pupil(16,"Megan", Pupil.Gender.FEMALE, LocalDate.of(2013,7,17)));
        pupils.add(new Pupil(13,"Penelopa", Pupil.Gender.FEMALE, LocalDate.of(2013,10,26)));

        System.out.println("1 Gender ");
        Map<Pupil.Gender, ArrayList<Pupil>> genderList = pupils.stream()
                .collect(Collectors.groupingBy(Pupil::getGender, Collectors.toCollection(ArrayList::new)));
        genderList.entrySet().forEach(System.out::println);
        System.out.println("3 AGE MIN");
        String age = pupils.stream()
                .max(Comparator.comparing(Pupil::getBirth))
                .toString();
        System.out.println(age);

        System.out.println("5 BurnYear");
        Map<Integer,List<Pupil>> year = pupils.stream()
                .collect(Collectors.groupingBy(Pupil::year));
        year.entrySet().forEach(System.out::println);
        System.out.println("6 Уникальные имена");
        Map<String,LocalDate> name = pupils.stream()
                .collect(Collectors.toMap(Pupil::getName,Pupil::getBirth,(elem1,elem2)->elem1));
        System.out.println(name);

        System.out.println("9 NAME");
        List<Pupil> bob = pupils.stream()
                .filter(pupil -> pupil.getName().equalsIgnoreCase("bob"))
                .collect(Collectors.toList());
        System.out.println(bob);



    }
}