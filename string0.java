package Homework;

public class string0 {
    public static void main(String[] args) {
        String str = "Privet";
        String str1 = "Poka";
        char[] chr = str.toCharArray();
        char[] chr1 = str1.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            if (i < str.length() / 2) {
                System.out.print(chr[i]);
            }
        }
        for (int i = 0; i < str1.length() ; i++) {
            if (i>=str1.length()/2) {
                System.out.print(chr1[i]);}
            }

        }

    }


