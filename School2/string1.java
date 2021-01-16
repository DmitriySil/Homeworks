package Homework.School2;
/*Даны 2 слова, состоящие из четного числа букв. Получить слово
состоящее из первой половины первого слова и второй половины второго слова.*/
public class string1 {
    public static void main(String[] args) {
        String str = "privet";
        String str1 = "poka";
        int a = str.length()/2;
        int b = str1.length()/2;
        int c = str1.length();
        System.out.print(str.substring(0,a));
        System.out.println(str1.substring(b,c));
    }
}
