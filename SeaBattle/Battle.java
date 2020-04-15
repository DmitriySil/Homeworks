package Homework.SeaBattle;

import java.util.Scanner;

public class Battle {
    public void start() {
        int[][] battlefield = new int[10][10];
        int countHC1 = 0,countBS = 0,countHC2 = 0,countLC1 = 0,countLC2 = 0,countLC3 = 0,countD1 = 0,countD2 = 0,
                countD3 = 0,countD4 = 0;

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
        LightCruiser lightCruiser1 = new LightCruiser();
        LightCruiser lightCruiser2 = new LightCruiser();
        LightCruiser lightCruiser3 = new LightCruiser();
        Destroyer destroyer1 = new Destroyer();
        Destroyer destroyer2 = new Destroyer();
        Destroyer destroyer3 = new Destroyer();
        Destroyer destroyer4 = new Destroyer();
        PrepareForBattle prepareForBattle = new PrepareForBattle(battleship,heavyCruiser1,heavyCruiser2,lightCruiser1,
                lightCruiser2,lightCruiser3,destroyer1,destroyer2,destroyer3,destroyer4);
        prepareForBattle.prepare();
        System.out.println("Бой начался");
        while (true) {
            System.out.println("Введите координаты стрельбы 'a,b,c,d,e,f,g,h,i,j'");
            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            char coordinates = scanner1.next().charAt(0);
            System.out.println("Введите коректировку '1,2,3,4,5,6,7,8,9,10'1");
            int coordinates2 = scanner2.nextInt();
            int count1 = 0;
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
                case 1: a = 0;break;
                case 2: a = 1;break;
                case 3: a = 2;break;
                case 4: a = 3;break;
                case 5: a = 4;break;
                case 6: a = 5;break;
                case 7: a = 6;break;
                case 8: a = 7;break;
                case 9: a = 8;break;
                case 10: a = 9;break;
            }
            System.out.println(battlefield[a][b]);// координаты введенные с клавиатуры(для сверки)
            for (int j = 0; j < battleship.decks.length; j++) {//координаты линкора,для проверки стрельбы(убрать или закоментить)
                System.out.print(" " + battleship.decks[j]);
            }
            System.out.println();
            for (int i = 0; i < battleship.decks.length; i++) {// Реализация стрельбы
                if (battleship.afloat && battleship.decks[i] == battlefield[a][b]) {
                        battleship.decks[i] = 0;
                        countBS++;
                        if (countBS == 4) {
                            battleship.setAfloat(false);
                            System.out.println("Линкор потоплен");
                            count1++;
                            break;
                        }
                        System.out.println("Попадание");
                        count1++;
                       break;
                }
            }
            for (int i = 0; i < heavyCruiser1.decks.length; i++) {
                if (heavyCruiser1.afloat && heavyCruiser1.decks[i] == battlefield[a][b]) {
                    heavyCruiser1.decks[i] = 0;
                    countHC1++;
                    if (countHC1 == 3) {
                       heavyCruiser1.setAfloat(false);
                        System.out.println("Тяжелый крейсер потоплен");
                        count1++;
                        break;
                    }
                    System.out.println("Попадание");
                    count1++;
                    break;
                }
            }

            for (int i = 0; i < heavyCruiser1.decks.length; i++) {
                if (heavyCruiser2.afloat && heavyCruiser2.decks[i] == battlefield[a][b]) {
                    heavyCruiser2.decks[i] = 0;
                    countHC2++;
                    if (countHC2 == 3) {
                        heavyCruiser2.setAfloat(false);
                        System.out.println("Тяжелый крейсер потоплен");
                        count1++;
                        break;
                    }
                    System.out.println("Попадание");
                    count1++;
                    break;
                }
            }

            for (int i = 0; i < lightCruiser1.decks.length; i++) {
                if (lightCruiser1.afloat && lightCruiser1.decks[i] == battlefield[a][b]) {
                    lightCruiser1.decks[i] = 0;
                    countLC1++;
                    if (countLC1 == 2) {
                        lightCruiser1.setAfloat(false);
                        System.out.println("Легкий крейсер потоплен");
                        count1++;
                        break;
                    }
                    System.out.println("Попадание");
                    count1++;
                    break;
                }
            }

            for (int i = 0; i < lightCruiser2.decks.length; i++) {
                if (lightCruiser2.afloat && lightCruiser2.decks[i] == battlefield[a][b]) {
                    lightCruiser2.decks[i] = 0;
                    countLC2++;
                    if (countLC2 == 2) {
                        lightCruiser2.setAfloat(false);
                        System.out.println("Легкий крейсер потоплен");
                        count1++;
                        break;
                    }
                    System.out.println("Попадание");
                    count1++;
                    break;
                }
            }
        if (count1==0){System.out.println("Промах");}


        }
    }
}
