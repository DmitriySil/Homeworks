package Homework.home;

import ru.ifmo.base.Lesson15.User;

import java.util.*;

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


    private static String text(String[] stArr){
        Map<String,String> sortW = new TreeMap<>();
        String finText = "";
        for (int i = 0; i <stArr.length ; i++){
            int count = 0;
            String[] splitArr = stArr[i].split(" ",2);

            if(sortW.containsKey(splitArr[0])){
            for(Map.Entry<String,String>entry:sortW.entrySet()){
            if (entry.getKey().equals(splitArr[0])){
                entry.setValue(entry.getValue() + "<->" + splitArr[1]);
                count++;
            } } }
            else sortW.put(splitArr[0],splitArr[1]);
        }
        for (Map.Entry<String,String>entry:sortW.entrySet()){
            finText = finText + "\n" + entry.getKey() + "\n";
            String[] splitArr2 = entry.getValue().split("<->");
            for (int i = 0; i < splitArr2.length; i++) {
                finText = finText + String.valueOf(i+1) + ")" + splitArr2[i] + "\n";
            }
        }
        //System.out.println(sortW);
        return finText;
    }
    //Task2
    private static String queen(String[] coordinate1,String[] coordinate2){
        //int[][] field = new int[8][8];
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new LinkedList<>();
        List<Integer> list4 = new LinkedList<>();
        List<Integer> list5 = new LinkedList<>();
        List<Integer> list6 = new LinkedList<>();
        List<Integer> list7 = new LinkedList<>();
        List<Integer> list8 = new LinkedList<>();
        String ans = null;

        for (int i = 0; i < coordinate1.length; i++) {
            if (i==0){ list1.add(Integer.valueOf(coordinate1[i]+coordinate2[i]));}
            if (i==1){ list2.add(Integer.valueOf(coordinate1[i]+coordinate2[i]));}
            if (i==2){ list3.add(Integer.valueOf(coordinate1[i]+coordinate2[i]));}
            if (i==3){ list4.add(Integer.valueOf(coordinate1[i]+coordinate2[i]));}
            if (i==4){ list5.add(Integer.valueOf(coordinate1[i]+coordinate2[i]));}
            if (i==5){ list6.add(Integer.valueOf(coordinate1[i]+coordinate2[i]));}
            if (i==6){ list7.add(Integer.valueOf(coordinate1[i]+coordinate2[i]));}
            if (i==7){ list8.add(Integer.valueOf(coordinate1[i]+coordinate2[i]));}
        }
        List<Integer> listException1 = new LinkedList<>();

        for (int i = 0, j = 20, k = 29; i < 6; i++, j = j + 10, k = k +10) {
            listException1.add(j);
            listException1.add(k);
        }

        for (int i = 0,j = 10,k = -10; i < 7; i++,j = j+10,k=k-10) {

            list1.add(list1.get(0) + j);
            list1.add(list1.get(0) + i+1);
            list1.add(list1.get(0) + k);
            list1.add(list1.get(0) + (-i-1));
            list1.add(list1.get(0) + j+i+1);
            list1.add(list1.get(0) + j-i-1);
            list1.add(list1.get(0) + k+i+1);
            list1.add(list1.get(0) + k-i-1);

            list2.add(list2.get(0) + j);
            list2.add(list2.get(0) + i+1);
            list2.add(list2.get(0) + k);
            list2.add(list2.get(0) + (-i-1));
            list2.add(list2.get(0) + j+i+1);
            list2.add(list2.get(0) + j-i-1);
            list2.add(list2.get(0) + k+i+1);
            list2.add(list2.get(0) + k-i-1);

            list3.add(list3.get(0) + j);
            list3.add(list3.get(0) + i+1);
            list3.add(list3.get(0) + k);
            list3.add(list3.get(0) + (-i-1));
            list3.add(list3.get(0) + j+i+1);
            list3.add(list3.get(0) + j-i-1);
            list3.add(list3.get(0) + k+i+1);
            list3.add(list3.get(0) + k-i-1);

            list4.add(list4.get(0) + j);
            list4.add(list4.get(0) + i+1);
            list4.add(list4.get(0) + k);
            list4.add(list4.get(0) + (-i-1));
            list4.add(list4.get(0) + j+i+1);
            list4.add(list4.get(0) + j-i-1);
            list4.add(list4.get(0) + k+i+1);
            list4.add(list4.get(0) + k-i-1);

            list5.add(list5.get(0) + j);
            list5.add(list5.get(0) + i+1);
            list5.add(list5.get(0) + k);
            list5.add(list5.get(0) + (-i-1));
            list5.add(list5.get(0) + j+i+1);
            list5.add(list5.get(0) + j-i-1);
            list5.add(list5.get(0) + k+i+1);
            list5.add(list5.get(0) + k-i-1);

            list6.add(list6.get(0) + j);
            list6.add(list6.get(0) + i+1);
            list6.add(list6.get(0) + k);
            list6.add(list6.get(0) + (-i-1));
            list6.add(list6.get(0) + j+i+1);
            list6.add(list6.get(0) + j-i-1);
            list6.add(list6.get(0) + k+i+1);
            list6.add(list6.get(0) + k-i-1);

            list7.add(list7.get(0) + j);
            list7.add(list7.get(0) + i+1);
            list7.add(list7.get(0) + k);
            list7.add(list7.get(0) + (-i-1));
            list7.add(list7.get(0) + j+i+1);
            list7.add(list7.get(0) + j-i-1);
            list7.add(list7.get(0) + k+i+1);
            list7.add(list7.get(0) + k-i-1);

            list8.add(list8.get(0) + j);
            list8.add(list8.get(0) + i+1);
            list8.add(list8.get(0) + k);
            list8.add(list8.get(0) + (-i-1));
            list8.add(list8.get(0) + j+i+1);
            list8.add(list8.get(0) + j-i-1);
            list8.add(list8.get(0) + k+i+1);
            list8.add(list8.get(0) + k-i-1);
        }
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < listException1.size(); j++) {
                if (list1.get(i).equals(listException1.get(j))){
                    list1.remove(i);
                    int k = 7;
                    while (true){
                        if (k + i >= list1.size()) break;
                        list1.remove(i+k);
                        k = k + 7;
                    }
                }
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < listException1.size(); j++) {
                if (list2.get(i).equals(listException1.get(j))){
                    list2.remove(i);
                    int k = 7;
                    while (true){
                        if (k + i >= list2.size()) break;
                        list2.remove(i+k);
                        k = k + 7;
                    }
                }
            }
        }
        for (int i = 0; i < list3.size(); i++) {
            for (int j = 0; j < listException1.size(); j++) {
                if (list3.get(i).equals(listException1.get(j))){
                    list3.remove(i);
                    int k = 7;
                    while (true){
                        if (k + i >= list3.size()) break;
                        list3.remove(i+k);
                        k = k + 7;
                    }
                }
            }
        }
        for (int i = 0; i < list4.size(); i++) {
            for (int j = 0; j < listException1.size(); j++) {
                if (list4.get(i).equals(listException1.get(j))){
                    list4.remove(i);
                    int k = 7;
                    while (true){
                        if (k + i >= list4.size()) break;
                        list4.remove(i+k);
                        k = k + 7;
                    }
                }
            }
        }
        for (int i = 0; i < list5.size(); i++) {
            for (int j = 0; j < listException1.size(); j++) {
                if (list5.get(i).equals(listException1.get(j))){
                    list5.remove(i);
                    int k = 7;
                    while (true){
                        if (k + i >= list5.size()) break;
                        list5.remove(i+k);
                        k = k + 7;
                    }
                }
            }
        }
        for (int i = 0; i < list6.size(); i++) {
            for (int j = 0; j < listException1.size(); j++) {
                if (list6.get(i).equals(listException1.get(j))){
                    list6.remove(i);
                    int k = 7;
                    while (true){
                        if (k + i >= list6.size()) break;
                        list6.remove(i+k);
                        k = k + 7;
                    }
                }
            }
        }
        for (int i = 0; i < list7.size(); i++) {
            for (int j = 0; j < listException1.size(); j++) {
                if (list7.get(i).equals(listException1.get(j))){
                    list7.remove(i);
                    int k = 7;
                    while (true){
                        if (k + i >=list7.size()) break;
                        list7.remove(i+k);
                        k = k + 7;
                    }
                }
            }
        }
        for (int i = 0; i < list8.size(); i++) {
            for (int j = 0; j < listException1.size(); j++) {
                if (list8.get(i).equals(listException1.get(j))){
                    list8.remove(i);
                    int k = 7;
                    while (true){
                        if (k + i >= list8.size()) break;
                        list8.remove(i+k);
                        k = k + 7;
                    }
                }
            }
        }
        int countCross = 0;
        for (int i = 0; i < coordinate1.length; i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(j).equals(Integer.valueOf(coordinate1[i] + coordinate2[i]))) {
                    if (i != 0) {
                        System.out.println("1");
                        countCross++;
                    }
                }}
            for (int j = 0; j < list2.size(); j++) {
                if (list2.get(j).equals(Integer.valueOf(coordinate1[i] + coordinate2[i]))) {
                    if (i != 1) {
                        System.out.println("2");
                        countCross++;
                    }
                }}
            for (int j = 0; j < list3.size(); j++) {
                if (list3.get(j).equals(Integer.valueOf(coordinate1[i] + coordinate2[i]))) {
                    if (i != 2) {
                        System.out.println("3");
                        countCross++;
                    }
                }}
            for (int j = 0; j < list4.size(); j++) {
                if (list4.get(j).equals(Integer.valueOf(coordinate1[i] + coordinate2[i]))) {
                    if (i != 3) {
                        System.out.println("4");
                        countCross++;
                    }
                }
            }
        }
        if (countCross == 0) {
            ans = "No";
        }
        else {
           ans = "Yes";
        }
//        for (int i = 0; i < field.length; ++i) {
//            for (int j = 0; j < field.length; ++j) {
//                System.out.print("  " + (i+1)+(j+1));
//            }
//            System.out.println();
//        }
        return ans;
    }
    //Task3
    private static String cod(String text){
        char[] charText = text.toCharArray();
        String codText;
        String finText = "";
        Map<Character,Integer> characterMap = new TreeMap<>();
        for (int i = 0; i <charText.length ; i++) {
            if (characterMap.containsKey(charText[i])){
                characterMap.replace(charText[i],characterMap.get(charText[i]),characterMap.get(charText[i])+1);
                if (i == charText.length-1){
                    finText = finText.concat(String.valueOf(charText[i])).concat(String.valueOf(characterMap.get(charText[i])));

                }
            }
            else if (i==0){
                characterMap.put(charText[i],1);
            }
            else{
                for(Map.Entry<Character,Integer>entry:characterMap.entrySet()){
                    codText = entry.getKey().toString();
                    codText = codText.concat(entry.getValue().toString());
                    finText = finText.concat(codText);
                }
                characterMap.clear();
                characterMap.put(charText[i],1);}

        }
        return finText;
    }

    public static void main(String[] args) {
        String[] stArr = new String[]{"Роль1: текст1 для роль1", "Роль2: текст1 для роль2", "Роль3: текст1 для роль3", "Роль1: текст2", "Роль2: текст2",
                "Роль3: текст2", "Роль1: текст3", "Роль2: текст3", "Роль1: текст4", "Роль2: текст4"};

        String[] st1 = new String[]{"1","3","5","7","2","4","6","8"};
        String[] st2 = new String[]{"2","6","3","7","4","8","1","5"};


        String str = "aabbbccccacffff";


        System.out.println(text(stArr));
        System.out.println(queen(st1,st2));
        System.out.println(cod(str));
    }
}