package Homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class string3 {
    public static void main(String[] args) {
        String str = "string stringstring";
        String str1 = "string";
        Pattern p = Pattern.compile(str1);
        Matcher m = p.matcher(str);
        int counter = 0;
        while (m.find()){
            counter++;
        }
        System.out.println(counter);

    }
}
