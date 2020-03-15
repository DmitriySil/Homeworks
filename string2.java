package Homework;

import java.util.Arrays;
/*Найдите самое длинное слово в предложении, при условии,
что в предложении все слова разной длины.*/
public class string2 {
    public static void main(String[] args) {
        String str = "в предложении все слова разной длинны";
        String[] strArr = str.split(" ");
        int a = strArr[0].length();
        for (int i = 0; i < strArr.length; i++) {
            if (a <= strArr[i].length())
                a = strArr[i].length();
        }
        for (int i = 0; i < strArr.length; i++) {
            if (a == strArr[i].length()){

            System.out.println(strArr[i]);}
        }


    }
}
