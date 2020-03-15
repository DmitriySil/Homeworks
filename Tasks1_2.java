package Homework;

public class Tasks1_2 {
    public static void main(String[] args) {
        int a = 64;
        int b = 30;

       while (a != 0 | b != 0){
            if (a > b){
                a = a % b;
            if (a % b == 0){
                System.out.println(b);
            break;}
            }

            if (a < b){
                b = b % a;
            if (b % a == 0){
                System.out.println(a);
            break;}
            }}
       int[] someArr = {1,2,3,4,-4,7,0,5};
        for (int i = 0; i < someArr.length ; i++) {
            for (int j = 0; j < someArr.length ; j++) {
                if (someArr[i]+someArr[j]==7)
                {
                    System.out.println(someArr[i]+"+"+someArr[j]);
                }


            }

        }



        }
        }
















