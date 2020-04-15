package Homework.SeaBattle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[][] strings = new char[10][10];
        char a = 'A';
        char b = '1';
        System.out.print("                  Поле битвы");
        for (int i = 0; i < strings.length; i++) {
            if (i < 1) {
                System.out.println();
                for (int j = 0; j < strings.length; j++,a++) {
                    strings[i][j] = a;
                    System.out.print("   " + strings[i][j]);

                }


            }
            else {
                if (i<2){
                    System.out.println();
                for (int j = 0; j < strings.length; j++) {
                    strings[j][i] = b;
                    b++;
                    if (j == 9){
                        b = '0';
                        strings[j][i] = b;}
                    System.out.println(" "+ strings[j][i]);

                }

            }}
        }
       Battle battle = new Battle();
        battle.start();
    }
}
