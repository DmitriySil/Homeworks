package Homework.SeaBattle;

import java.util.Random;

public class PrepareForBattle {

        public Battleship battleship;

    public Battleship getBattleship() {
        return battleship;
    }

    public void setBattleship(Battleship battleship) {
        this.battleship = battleship;
    }

    public PrepareForBattle(Battleship battleship) {
        this.battleship = battleship;
    }

    public void prepare() {
            Random random = new Random();

            HeavyCruiser heavyCruiser1 = new HeavyCruiser();
            HeavyCruiser heavyCruiser2 = new HeavyCruiser();


            int[][] battlefield = new int[10][10];
            for (int i = 0; i < battlefield.length; ++i) {
                for (int j = 0; j < battlefield.length; ++j) {
                    battlefield[i][j] = (i * 10) + j + 1;
                    System.out.print("  " + battlefield[i][j]);
                }
                System.out.println();
            }
//расстановка кораблей начиная с большего
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            for (int i = 0; i < battleship.decks.length; i++) {
                if (battlefield[a][b] != 0 && i < 1) {
                    battleship.decks[i] = battlefield[a][b];

                }
                if (a > 5 && b > 5) {
                    for (int j = 1, s = 1; j < battleship.decks.length; s++, j++) {
                        battlefield[a][b] = battlefield[a - s][b];
                        battleship.decks[j] = battlefield[a][b];
                    }
                    if (a == 9 && b != 9) {
                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                        battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                        battlefield[a - 3][b] = 0;battlefield[a - 3][b - 1] = 111;battlefield[a - 3][b + 1] = 111;
                        battlefield[a - 4][b] = 111;battlefield[a - 4][b - 1] = 111;battlefield[a - 4][b + 1] = 111;
                        break;
                    }
                    else
                        if (a != 9 && b == 9) {
                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                            battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                            battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;
                            battlefield[a - 3][b] = 0;battlefield[a - 3][b - 1] = 111;
                            battlefield[a - 4][b] = 111;battlefield[a - 4][b - 1] = 111;
                            battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                            break;
                        }
                        else
                            if (a == 9 && b == 9) {
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;
                                battlefield[a - 3][b] = 0;battlefield[a - 3][b - 1] = 111;
                                battlefield[a - 4][b] = 111;battlefield[a - 4][b - 1] = 111;
                                break;
                            }
                            else {
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                battlefield[a - 3][b] = 0;battlefield[a - 3][b - 1] = 111;battlefield[a - 3][b + 1] = 111;
                                battlefield[a - 4][b] = 111;battlefield[a - 4][b - 1] = 111;battlefield[a - 4][b + 1] = 111;
                                battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                                break;
                            }
                }
                else
                    if (a > 6 && b < 3) {
                        for (int j = 1, s = 1; j < battleship.decks.length; s++, j++) {
                            battlefield[a][b] = battlefield[a - s][b];
                            battleship.decks[j] = battlefield[a][b];
                        }
                        if (a == 9 && b != 0) {
                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                            battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;
                            battlefield[a][b + 3] = 0;battlefield[a - 1][b + 3] = 111;
                            battlefield[a][b + 4] = 111;battlefield[a - 1][b + 4] = 111;
                            battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                            break;
                        }
                        else
                            if (a != 9 && b == 0) {
                                battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                battlefield[a][b + 3] = 0;battlefield[a - 1][b + 3] = 111;battlefield[a + 1][b + 3] = 111;
                                battlefield[a][b + 4] = 111;battlefield[a - 1][b + 4] = 111;battlefield[a + 1][b + 4] = 111;
                                break;
                            }
                            else
                                if (a == 9 && b == 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                    battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;
                                    battlefield[a][b + 3] = 0;battlefield[a - 1][b + 3] = 111;
                                    battlefield[a][b + 4] = 111;battlefield[a - 1][b + 4] = 111;
                                    break;
                                }
                                else {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                    battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                    battlefield[a][b + 3] = 0;battlefield[a - 1][b + 3] = 111;battlefield[a + 1][b + 3] = 111;
                                    battlefield[a][b + 4] = 111;battlefield[a - 1][b + 4] = 111;battlefield[a + 1][b + 4] = 111;
                                    battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                    break;
                                }
                    }

            }
            for (int j = 0; j < battleship.decks.length; j++) {
                System.out.print(" " + battleship.decks[j]);
            }
            System.out.println();


            for (int i = 0; i < battlefield.length; ++i) {
                for (int j = 0; j < battlefield.length; ++j) {
                    System.out.print("   " + battlefield[i][j]);
                }
                System.out.println();
            }
        }
}
