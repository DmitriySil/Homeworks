package Homework.School2;

import java.util.Arrays;

public class Tasks5 {
    public static void main(String[] args) {
        int arr[][] = new int[5][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = (int) (Math.random()*198-99);
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        int max;
        max = arr[0][0];
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 8 ; j++) {
                if(arr[i][j]>max)
                    max = arr[i][j];}}
                System.out.println(max);





    }
}
