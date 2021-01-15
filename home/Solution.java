package Homework.home;

import ru.ifmo.base.Lesson15.User;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Задача №1
// Вам дан список ролей и сценарий пьесы в виде массива строчек.
//
//Каждая строчка сценария пьесы дана в следующем виде:
// Роль: текст
//
//Текст может содержать любые символы.
//
// Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста
//        (см. пример). Каждая группа распечатывается в следующем виде:
//    Роль:
//   i) текст
//   j) текст2
//    ...
//   ==перевод строки==
//
// i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии
// с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.
public class Solution {


    private static Map<String,String> text(String[] stArr){
        Map<String,String> sortW = new HashMap<>();
        for (int i = 0; i <stArr.length ; i++){
            int count = 0;
            String[] splitArr = stArr[i].split(" ");
            if(i==0)  {sortW.put(splitArr[0],splitArr[1]);}
            if(i>0){
            for(Map.Entry<String,String>entry:sortW.entrySet()){
            if (entry.getKey().equals(splitArr[0])){
                entry.setValue(entry.getValue() + " " + splitArr[1]);
                count++;
            } }
            if(count==0){ sortW.put(splitArr[0],splitArr[1]);
               } } }
        System.out.println(sortW);
        return sortW;
    }

    public static void main(String[] args) {
        String[] stArr = new String[]{"Роль1: текст1", "Роль2: текст1", "Роль3: текст1", "Роль1: текст2", "Роль2: текст2",
                "Роль3: текст2", "Роль1: текст3", "Роль2: текст3", "Роль1: текст4", "Роль2: текст4"};
text(stArr);
    }
}