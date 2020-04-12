package Homework.SeaBattle;

import java.util.Scanner;

public class Battle {
    public void start() {
        int[][] battlefield = new int[10][10];
        int count = 0;

        for (int i = 0; i < battlefield.length; ++i) {
            for (int j = 0; j < battlefield.length; ++j) {
                battlefield[i][j] = (i * 10) + j + 1;
                System.out.print("  " + battlefield[i][j]);
            }
            System.out.println();
        }
        Battleship battleship = new Battleship();
        HeavyCruiser heavyCruiser1 = new HeavyCruiser();
        HeavyCruiser heavyCruiser2 = new HeavyCruiser();
        PrepareForBattle prepareForBattle = new PrepareForBattle(battleship,heavyCruiser1,heavyCruiser2);
        prepareForBattle.prepare();
        System.out.println("Бой начался");
        while (true) {
            System.out.println("Введите координаты стрельбы 'a,b,c,d,e,f,g,h,i,j'");
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            char coordinates = scanner1.next().charAt(0);
            System.out.println("Введите коректировку '1,2,3,4,5,6,7,8,9,10'1");
            int coordinates2 = scanner2.nextInt();

            System.out.println(coordinates);
            int a = 0, b = 0;
//        сравнение введенныхкоординат с цифрами
            switch (coordinates) {
                case 'a': b = 0;break;
                case 'b': b = 1;break;
                case 'c': b = 2;break;
                case 'd': b = 3;break;
                case 'e': b = 4;break;
                case 'f': b = 5;break;
                case 'g': b = 6;break;
                case 'h': b = 7;break;
                case 'i': b = 8;break;
                case 'j': b = 9;break;
            }
            switch (coordinates2) {
                case 1:
                    a = 0;
                    break;
                case 2:
                    a = 1;
                    break;
                case 3:
                    a = 2;
                    break;
                case 4:
                    a = 3;
                    break;
                case 5:
                    a = 4;
                    break;
                case 6:
                    a = 5;
                    break;
                case 7:
                    a = 6;
                    break;
                case 8:
                    a = 7;
                    break;
                case 9:
                    a = 8;
                    break;
                case 10:
                    a = 9;
                    break;
            }
            System.out.println(battlefield[a][b]);
            for (int j = 0; j < battleship.decks.length; j++) {
                System.out.print(" " + battleship.decks[j]);
            }
            System.out.println();
            for (int i = 0; i < battleship.decks.length; i++) {
                if (battleship.afloat && battleship.decks[i] == battlefield[a][b]) {
                        battleship.decks[i] = 0;
                        count++;
                        if (count == 4) {
                            battleship.setAfloat(false);
                            System.out.println("sunk");
                            break;
                        }
                        System.out.println("hit");
                        break;
                }if (i<3)
                    continue;
                System.out.println("miss");
            }

        }
    }
}
