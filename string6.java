package Homework;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class string6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите названия городов через пробел");
        Scanner sc = new Scanner(System.in);
        String cit = sc.nextLine();
        String[] citArr = cit.split(" ");
        Arrays.sort(citArr);
        for (String ci : citArr) {
            System.out.println(ci);
        }
        }
}

