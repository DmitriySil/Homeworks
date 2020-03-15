package Homework;

import java.util.Arrays;

public class Tasks3 {
    public static void main(String[] args) {


    int[] array = new int[12];
    double sum = 0;
                for ( int i = 0; i < array.length; i++) {
                    array[i] = (int) ((Math.random() * 32));
                    sum += array[i];
                    System.out.println(Arrays.toString(array));
                    System.out.println(sum/array.length);}
                    Arrays.sort(array);
                    int a = array.length - 1;
                    System.out.println(array[a]);
                    System.out.println(array[0]);}
                    }









