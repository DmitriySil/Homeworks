package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks4 {
    public static void main(String[] args) {

            System.out.println("Введити число > 3");
        while (true) {
            Scanner num = new Scanner(System.in);
            int n = num.nextInt();
            if (n < 3)
                System.out.println("Повторите ввод");
            else {
                int[] array = new int[n];
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (Math.random() * n);
                }
                System.out.println(Arrays.toString(array));
                int k = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] % 2 == 0 && array[j] != 0)
                        k++;
                }
                if (k >= 0) {
                    int[] array1 = new int[k];

                    int j = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 == 0 && array[i] != 0) {

                            array1[j] = array[i];
                            j++;
                        }
                    }
                    System.out.println(Arrays.toString(array1));
                    break;
                }
            }



        }
    }

}




