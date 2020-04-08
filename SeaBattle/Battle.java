package Homework.SeaBattle;

import java.util.Scanner;

public class Battle {
    public static void main(String[] args) {
        Battleship battleship = new Battleship();
        PrepareForBattle prepareForBattle = new PrepareForBattle(battleship);
        prepareForBattle.prepare();
        System.out.println("Shoot");
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        char coordinates = scanner1.next().charAt(0);
        int coordinates2 = scanner2.nextInt();
        coordinates++;
        System.out.println(coordinates);
        if (coordinates == 'a' && coordinates2 == 1){}
//        сравнение введенныхкоординат с цифрами

    }
}
