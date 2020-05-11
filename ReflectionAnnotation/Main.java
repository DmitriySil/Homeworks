package Homework.ReflectionAnnotation;

//        1.написать рефлексивный статический static toString(Object o)
//        вывести информацию по полям объекта,используя рефлексию:
//        название поля:значение поля
//

import ru.ifmo.base.Lesson16.reflection.TextMessage;

import java.lang.reflect.Field;
import java.util.Arrays;

//      2.если класс анатирован аннатацией ConfigClass,
//        создать объект данного класса(использовать рефлексию)
//        если поле отмечено аннотацией @Required-установить значение данного поля
//        значение поля установить черезсеттер StringData/setStringData
//        field.getName
//        field.getType
//        у созданного объекта вызвать метод public String toString() используя рефлексию
//
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
    TestRefAn.toString("f",1);
        Class testRef = TestRefAn.class;
        String className = testRef.getName();
        System.out.println(className);

        Class<TestRefAn>  accessField = TestRefAn.class;
        Field[] fields = accessField.getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        Field field = accessField.getDeclaredField("first");
        field.setAccessible(true);
        System.out.println(field.getName());


    }
}

class TestRefAn{
    private String first="First";
    public int second = 2;



    static void toString (String first, int second){
        System.out.println(first+second);
    }
}

