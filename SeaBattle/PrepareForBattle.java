package Homework.SeaBattle;

import java.util.Random;

public class PrepareForBattle {

        public Battleship battleship;
        public HeavyCruiser heavyCruiser1;
        public HeavyCruiser heavyCruiser2;
        public int[][] battlefield = new int[10][10];

    public HeavyCruiser getHeavyCruiser1() {
        return heavyCruiser1;
    }

    public void setHeavyCruiser1(HeavyCruiser heavyCruiser1) {
        this.heavyCruiser1 = heavyCruiser1;
    }

    public HeavyCruiser getHeavyCruiser2() {
        return heavyCruiser2;
    }

    public void setHeavyCruiser2(HeavyCruiser heavyCruiser2) {
        this.heavyCruiser2 = heavyCruiser2;
    }

    public int[][] getBattlefield() {
        return battlefield;
    }

    public void setBattlefield(int[][] battlefield) {
        this.battlefield = battlefield;
    }

    public Battleship getBattleship() {
        return battleship;
    }

    public void setBattleship(Battleship battleship) {
        this.battleship = battleship;
    }



    public PrepareForBattle(Battleship battleship, HeavyCruiser heavyCruiser1, HeavyCruiser heavyCruiser2) {
        this.battleship = battleship;
        this.heavyCruiser1 = heavyCruiser1;
        this.heavyCruiser2 = heavyCruiser2;
    }

    public void prepare() {
            Random random = new Random();

            for (int i = 0; i < battlefield.length; ++i) {
                for (int j = 0; j < battlefield.length; ++j) {
                    battlefield[i][j] = (i * 10) + j + 1;
                    System.out.print("  " + battlefield[i][j]);
                }
                System.out.println();
            }
//расстановка кораблей начиная с большего
//        battleship
            int a = random.nextInt(10);
            int b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            for (int i = 0; i < battleship.decks.length; i++) {
                if (battlefield[a][b] != 0 && i < 1) {
                    battleship.decks[i] = battlefield[a][b];

                }
                if (a > 6 && b > 6) {
                    for (int j = 1, s = 1; j < battleship.decks.length; s++, j++) {
                        battlefield[a][b] = battlefield[a - s][b];
                        battleship.decks[j] = battlefield[a][b];
                    }
                    if (a == 9 && b != 9) {    //ограждение вокругкорабля,куданельзя ставить др
                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                        battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                        battlefield[a - 3][b] = 0;battlefield[a - 3][b - 1] = 111;battlefield[a - 3][b + 1] = 111;
                        battlefield[a - 4][b] = 111;battlefield[a - 4][b - 1] = 111;battlefield[a - 4][b + 1] = 111;
                        System.out.println("4 право низ 1");
                        break;
                    }
                    else if (a != 9 && b == 9) {
                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                            battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                            battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;
                            battlefield[a - 3][b] = 0;battlefield[a - 3][b - 1] = 111;
                            battlefield[a - 4][b] = 111;battlefield[a - 4][b - 1] = 111;
                            battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                        System.out.println("4 право низ 2");
                            break;
                        }
                        else if (a == 9 && b == 9) {
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;
                                battlefield[a - 3][b] = 0;battlefield[a - 3][b - 1] = 111;
                                battlefield[a - 4][b] = 111;battlefield[a - 4][b - 1] = 111;
                            System.out.println("4 право низ 3");
                                break;
                            }
                            else {
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                battlefield[a - 3][b] = 0;battlefield[a - 3][b - 1] = 111;battlefield[a - 3][b + 1] = 111;
                                battlefield[a - 4][b] = 111;battlefield[a - 4][b - 1] = 111;battlefield[a - 4][b + 1] = 111;
                                battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                            System.out.println("4 право низ 4");
                                break;
                            }
                }
                else if (a > 6 && b < 3) {
                        for (int j = 1, s = 1; j < battleship.decks.length; s++, j++) {
                            battlefield[a][b] = battlefield[a][b+s];
                            battleship.decks[j] = battlefield[a][b];
                        }
                        if (a == 9 && b != 0) {
                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                            battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;
                            battlefield[a][b + 3] = 0;battlefield[a - 1][b + 3] = 111;
                            battlefield[a][b + 4] = 111;battlefield[a - 1][b + 4] = 111;
                            battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                            System.out.println("4 лево низ 1");
                            break;
                        }
                        else
                            if (a != 9 && b == 0) {
                                battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                battlefield[a][b + 3] = 0;battlefield[a - 1][b + 3] = 111;battlefield[a + 1][b + 3] = 111;
                                battlefield[a][b + 4] = 111;battlefield[a - 1][b + 4] = 111;battlefield[a + 1][b + 4] = 111;
                                System.out.println("4 лево низ 2");
                                break;
                            }
                            else
                                if (a == 9 && b == 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                    battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;
                                    battlefield[a][b + 3] = 0;battlefield[a - 1][b + 3] = 111;
                                    battlefield[a][b + 4] = 111;battlefield[a - 1][b + 4] = 111;
                                    System.out.println("4 лево низ 3");
                                    break;
                                }
                                else {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                    battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                    battlefield[a][b + 3] = 0;battlefield[a - 1][b + 3] = 111;battlefield[a + 1][b + 3] = 111;
                                    battlefield[a][b + 4] = 111;battlefield[a - 1][b + 4] = 111;battlefield[a + 1][b + 4] = 111;
                                    battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                    System.out.println("4 лево низ 4");
                                    break;
                                }
                    }else if (a<4 && b<4){
                    for (int j = 1, s = 1; j < battleship.decks.length; s++, j++) {
                        battlefield[a][b] = battlefield[a + s][b];
                        battleship.decks[j] = battlefield[a][b];}
                        if (a != 0 && b == 0) {
                            battlefield[a][b] = 0;battlefield[a][b+1] = 111;
                            battlefield[a+1][b] = 0;battlefield[a - 1][b + 1] = 111;
                            battlefield[a+2][b] = 0;battlefield[a - 1][b + 1] = 111;
                            battlefield[a+3][b] = 0;battlefield[a - 1][b + 1] = 111;
                            battlefield[a+4][b] = 111;battlefield[a - 1][b + 1] = 111;
                            battlefield[a-1][b] = 111;battlefield[a - 1][b +1] = 111;
                            System.out.println("4 лево верх 1");
                            break;
                        }
                        else if (a == 0 && b != 0) {
                                battlefield[a][b] = 0;battlefield[a][b-1] = 111;battlefield[a][b+1] = 111;
                                battlefield[a+1][b] = 0;battlefield[a +1][b -1] = 111;battlefield[a + 1][b + 1] = 111;
                                battlefield[a+2][b] = 0;battlefield[a +2][b -1] = 111;battlefield[a + 2][b + 1] = 111;
                                battlefield[a+3][b] = 0;battlefield[a + 3][b -1] = 111;battlefield[a + 3][b + 1] = 111;
                                battlefield[a+4][b] = 111;battlefield[a + 4][b-1] = 111;battlefield[a + 4][b + 1] = 111;
                            System.out.println("4 лево верх 2");
                                break;
                            }
                            else
                                if (a == 0 && b == 0) {
                                    battlefield[a][b] = 0;battlefield[a][b+1] = 111;
                                    battlefield[a+1][b] = 0;battlefield[a][b + 1] = 111;
                                    battlefield[a+2][b] = 0;battlefield[a][b + 1] = 111;
                                    battlefield[a+3][b] = 0;battlefield[a][b + 1] = 111;
                                    battlefield[a+4][b] = 111;battlefield[a + 4][b + 1] = 111;
                                    System.out.println("4 лево верх 3");
                                    break;
                                }
                                else {
                                    battlefield[a][b] = 0;battlefield[a][b-1] = 111;battlefield[a][b+1] = 111;
                                    battlefield[a+1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                    battlefield[a+2][b] = 0;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                    battlefield[a+3][b] = 0;battlefield[a + 3][b - 1] = 111;battlefield[a + 3][b + 1] = 111;
                                    battlefield[a+4][b] = 111;battlefield[a + 4][b - 1] = 111;battlefield[a + 4][b + 1] = 111;
                                    battlefield[a-1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                    System.out.println("4 лево верх 4");
                                    break;
                                }

                }
               else if (a<4 && b>6){
                    for (int j = 1, s = 1; j < battleship.decks.length; s++, j++) {
                        battlefield[a][b] = battlefield[a + s][b];
                        battleship.decks[j] = battlefield[a][b];}
                        if (a != 0 && b == 9) {
                            battlefield[a][b] = 0;battlefield[a][b-1] = 111;
                            battlefield[a+1][b] = 0;battlefield[a + 1][b - 1] = 111;
                            battlefield[a+2][b] = 0;battlefield[a +2][b - 1] = 111;
                            battlefield[a+3][b] = 0;battlefield[a +3][b - 1] = 111;
                            battlefield[a+4][b] = 111;battlefield[a +4][b - 1] = 111;
                            battlefield[a-1][b] = 111;battlefield[a - 1][b -1] = 111;
                            System.out.println("4 право верх 1");
                            break;
                        }
                        else if (a == 0 && b != 9) {
                            battlefield[a][b] = 0;battlefield[a][b-1] = 111;battlefield[a][b+1] = 111;
                            battlefield[a+1][b] = 0;battlefield[a +1][b -1] = 111;battlefield[a + 1][b + 1] = 111;
                            battlefield[a+2][b] = 0;battlefield[a +2][b -1] = 111;battlefield[a + 2][b + 1] = 111;
                            battlefield[a+3][b] = 0;battlefield[a + 3][b -1] = 111;battlefield[a + 3][b + 1] = 111;
                            battlefield[a+4][b] = 111;battlefield[a + 4][b-1] = 111;battlefield[a + 4][b + 1] = 111;
                            System.out.println("4 право верх 2");
                            break;
                        }
                        else
                            if (a == 0 && b == 9) {
                                battlefield[a][b] = 0;battlefield[a][b+1] = 111;
                                battlefield[a+1][b] = 0;battlefield[a+1][b - 1] = 111;
                                battlefield[a+2][b] = 0;battlefield[a+2][b - 1] = 111;
                                battlefield[a+3][b] = 0;battlefield[a+3][b - 1] = 111;
                                battlefield[a+4][b] = 111;battlefield[a + 4][b - 1] = 111;
                                System.out.println("4 право верх 3");
                                break;
                            }
                            else {
                                battlefield[a][b] = 0;battlefield[a][b-1] = 111;battlefield[a][b+1] = 111;
                                battlefield[a+1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                battlefield[a+2][b] = 0;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                battlefield[a+3][b] = 0;battlefield[a + 3][b - 1] = 111;battlefield[a + 3][b + 1] = 111;
                                battlefield[a+4][b] = 111;battlefield[a + 4][b - 1] = 111;battlefield[a + 4][b + 1] = 111;
                                battlefield[a-1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                System.out.println("4 право верх 4");
                                break;
                            }// todo  добавить ,что в остальных случаях
               }
            }
//            heavyCruiser todo
while ((battlefield[a][b] == 0 || battlefield[a][b] == 111 || battlefield[a - 1][b] == 0 || battlefield[a - 1][b] == 111
        || battlefield[a - 2][b] == 0 || battlefield[a - 2][b] == 111)){
         a = random.nextInt(10);
         b = random.nextInt(10);
        System.out.println(battlefield[a][b]);
        for (int i = 0,st = 0; i < heavyCruiser1.decks.length; i++) {
            if (battlefield[a][b] != 0 && battlefield[a][b] != 111 && i < 1) {
                st = battlefield[a][b];

            if (a > 7 && b > 7) {
                if (battlefield[a - 1][b] != 0 && battlefield[a - 1][b] != 111 && battlefield[a - 2][b] != 0 &&
                        battlefield[a - 2][b] != 111) {
                    heavyCruiser1.decks[0] = st;
                    heavyCruiser1.decks[1] = st - 10;
                    heavyCruiser1.decks[2] = st - 20;
                    if (a == 9 && b != 9) {    //ограждение корабля,куданельзя ставить др
                        battlefield[a][b] = 0;
                        battlefield[a][b - 1] = 111;
                        battlefield[a][b + 1] = 111;
                        battlefield[a - 1][b] = 0;
                        battlefield[a - 1][b - 1] = 111;
                        battlefield[a - 1][b + 1] = 111;
                        battlefield[a - 2][b] = 0;
                        battlefield[a - 2][b - 1] = 111;
                        battlefield[a - 2][b + 1] = 111;
                        battlefield[a - 3][b] = 111;
                        battlefield[a - 3][b - 1] = 111;
                        battlefield[a - 3][b + 1] = 111;
                        System.out.println("3 право низ 1");
                        break;
                    }
                    else
                        if (a != 9 && b == 9) {
                            battlefield[a][b] = 0;
                            battlefield[a][b - 1] = 111;
                            battlefield[a - 1][b] = 0;
                            battlefield[a - 1][b - 1] = 111;
                            battlefield[a - 2][b] = 0;
                            battlefield[a - 2][b - 1] = 111;
                            battlefield[a - 3][b] = 111;
                            battlefield[a - 3][b - 1] = 111;
                            battlefield[a + 1][b - 1] = 111;
                            battlefield[a + 1][b] = 111;
                            System.out.println("3 право низ 2");
                            break;
                        }
                        else
                            if (a == 9 && b == 9) {
                                battlefield[a][b] = 0;
                                battlefield[a][b - 1] = 111;
                                battlefield[a - 1][b] = 0;
                                battlefield[a - 1][b - 1] = 111;
                                battlefield[a - 2][b] = 0;
                                battlefield[a - 2][b - 1] = 111;
                                battlefield[a - 3][b] = 111;
                                battlefield[a - 3][b - 1] = 111;
                                System.out.println("3 право низ 3");
                                break;
                            }
                            else {
                                battlefield[a][b] = 0;
                                battlefield[a][b - 1] = 111;
                                battlefield[a][b + 1] = 111;
                                battlefield[a - 1][b] = 0;
                                battlefield[a - 1][b - 1] = 111;
                                battlefield[a - 1][b + 1] = 111;
                                battlefield[a - 2][b] = 0;
                                battlefield[a - 2][b - 1] = 111;
                                battlefield[a - 2][b + 1] = 111;
                                battlefield[a - 3][b] = 111;
                                battlefield[a - 3][b - 1] = 111;
                                battlefield[a - 3][b + 1] = 111;
                                battlefield[a + 1][b - 1] = 111;
                                battlefield[a + 1][b + 1] = 111;
                                battlefield[a + 1][b] = 111;
                                System.out.println("3 право низ 4");
                                break;
                            }
                }
            }
            else
                if (a > 7 && b < 2) {
                    if (battlefield[a][b + 1] != 0 && battlefield[a][b + 1] != 111 && battlefield[a][b + 2] != 0 &&
                            battlefield[a][b + 2] != 111) {
                        heavyCruiser1.decks[0] = st;
                        heavyCruiser1.decks[1] = st + 1;
                        heavyCruiser1.decks[2] = st + 2;
                        if (a == 9 && b != 0) {
                            battlefield[a][b] = 0;
                            battlefield[a - 1][b] = 111;
                            battlefield[a][b + 1] = 0;
                            battlefield[a - 1][b + 1] = 111;
                            battlefield[a][b + 2] = 0;
                            battlefield[a - 1][b + 2] = 111;
                            battlefield[a][b + 3] = 111;
                            battlefield[a - 1][b + 3] = 111;
                            battlefield[a][b - 1] = 111;
                            battlefield[a - 1][b - 1] = 111;
                            System.out.println("3 лев низ 1");
                            break;
                        }
                        else
                            if (a != 9 && b == 0) {
                                battlefield[a][b] = 0;
                                battlefield[a - 1][b] = 111;
                                battlefield[a + 1][b] = 111;
                                battlefield[a][b + 1] = 0;
                                battlefield[a - 1][b + 1] = 111;
                                battlefield[a + 1][b + 1] = 111;
                                battlefield[a][b + 2] = 0;
                                battlefield[a - 1][b + 2] = 111;
                                battlefield[a + 1][b + 2] = 111;
                                battlefield[a][b + 3] = 111;
                                battlefield[a - 1][b + 3] = 111;
                                battlefield[a + 1][b + 3] = 111;
                                System.out.println("3 лев низ 2");
                                break;
                            }
                            else
                                if (a == 9 && b == 0) {
                                    battlefield[a][b] = 0;
                                    battlefield[a - 1][b] = 111;
                                    battlefield[a][b + 1] = 0;
                                    battlefield[a - 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 0;
                                    battlefield[a - 1][b + 2] = 111;
                                    battlefield[a][b + 3] = 111;
                                    battlefield[a - 1][b + 3] = 111;
                                    System.out.println("3 лев низ 3");
                                    break;
                                }
                                else {
                                    battlefield[a][b] = 0;
                                    battlefield[a - 1][b] = 111;
                                    battlefield[a + 1][b] = 111;
                                    battlefield[a][b + 1] = 0;
                                    battlefield[a - 1][b + 1] = 111;
                                    battlefield[a + 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 0;
                                    battlefield[a - 1][b + 2] = 111;
                                    battlefield[a + 1][b + 2] = 111;
                                    battlefield[a][b + 3] = 111;
                                    battlefield[a - 1][b + 3] = 111;
                                    battlefield[a + 1][b + 3] = 111;
                                    battlefield[a][b - 1] = 111;
                                    battlefield[a - 1][b - 1] = 111;
                                    battlefield[a + 1][b - 1] = 111;
                                    System.out.println("3 лев низ 4");
                                    break;
                                }
                    }
                }
                else
                    if (a < 3 && b < 3) {

                        if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111 && battlefield[a + 2][b] != 0 &&
                                battlefield[a + 2][b] != 111) {
                            heavyCruiser1.decks[0] = st;
                            heavyCruiser1.decks[1] = st + 10;
                            heavyCruiser1.decks[2] = st + 20;
                            if (a != 0 && b == 0) {
                                battlefield[a][b] = 0;
                                battlefield[a][b + 1] = 111;
                                battlefield[a + 1][b] = 0;
                                battlefield[a - 1][b + 1] = 111;
                                battlefield[a + 2][b] = 0;
                                battlefield[a - 1][b + 1] = 111;
                                battlefield[a + 3][b] = 111;
                                battlefield[a - 1][b + 1] = 111;
                                battlefield[a - 1][b] = 111;
                                battlefield[a - 1][b + 1] = 111;
                                System.out.println("3 лев верх 1");
                                break;
                            }
                            else
                                if (a == 0 && b != 0) {
                                    battlefield[a][b] = 0;
                                    battlefield[a][b - 1] = 111;
                                    battlefield[a][b + 1] = 111;
                                    battlefield[a + 1][b] = 0;
                                    battlefield[a + 1][b - 1] = 111;
                                    battlefield[a + 1][b + 1] = 111;
                                    battlefield[a + 2][b] = 0;
                                    battlefield[a + 2][b - 1] = 111;
                                    battlefield[a + 2][b + 1] = 111;
                                    battlefield[a + 3][b] = 111;
                                    battlefield[a + 3][b - 1] = 111;
                                    battlefield[a + 3][b + 1] = 111;
                                    System.out.println("3 лев верх 2");
                                    break;
                                }
                                else
                                    if (a == 0 && b == 0) {
                                        battlefield[a][b] = 0;
                                        battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 0;
                                        battlefield[a][b + 1] = 111;
                                        battlefield[a + 2][b] = 0;
                                        battlefield[a][b + 1] = 111;
                                        battlefield[a + 3][b] = 111;
                                        battlefield[a][b + 1] = 111;
                                        System.out.println("3 лев верх 3");
                                        break;
                                    }
                                    else {
                                        battlefield[a][b] = 0;
                                        battlefield[a][b - 1] = 111;
                                        battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 0;
                                        battlefield[a + 1][b - 1] = 111;
                                        battlefield[a + 1][b + 1] = 111;
                                        battlefield[a + 2][b] = 0;
                                        battlefield[a + 2][b - 1] = 111;
                                        battlefield[a + 2][b + 1] = 111;
                                        battlefield[a + 3][b] = 111;
                                        battlefield[a + 3][b - 1] = 111;
                                        battlefield[a + 3][b + 1] = 111;
                                        battlefield[a - 1][b] = 111;
                                        battlefield[a - 1][b - 1] = 111;
                                        battlefield[a - 1][b + 1] = 111;
                                        System.out.println("3 лев верх 4");
                                        break;
                                    }
                        }

                    }
                    else
                        if (a < 3 && b > 7) {
                            if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111 && battlefield[a + 2][b] != 0 &&
                                    battlefield[a + 2][b] != 111) {
                                heavyCruiser1.decks[0] = st;
                                heavyCruiser1.decks[1] = st + 10;
                                heavyCruiser1.decks[2] = st + 20;
                                if (a != 0 && b == 9) {
                                    battlefield[a][b] = 0;
                                    battlefield[a][b - 1] = 111;
                                    battlefield[a + 1][b] = 0;
                                    battlefield[a + 1][b - 1] = 111;
                                    battlefield[a + 2][b] = 0;
                                    battlefield[a + 2][b - 1] = 111;
                                    battlefield[a + 3][b] = 111;
                                    battlefield[a + 3][b - 1] = 111;
                                    battlefield[a - 1][b] = 111;
                                    battlefield[a - 1][b - 1] = 111;
                                    System.out.println("3 прав верх 1");
                                    break;
                                }
                                else
                                    if (a == 0 && b != 9) {
                                        battlefield[a][b] = 0;
                                        battlefield[a][b - 1] = 111;
                                        battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 0;
                                        battlefield[a + 1][b - 1] = 111;
                                        battlefield[a + 1][b + 1] = 111;
                                        battlefield[a + 2][b] = 0;
                                        battlefield[a + 2][b - 1] = 111;
                                        battlefield[a + 2][b + 1] = 111;
                                        battlefield[a + 3][b] = 111;
                                        battlefield[a + 3][b - 1] = 111;
                                        battlefield[a + 3][b + 1] = 111;
                                        System.out.println("3 прав верх 2");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b == 9) {
                                            battlefield[a][b] = 0;
                                            battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 0;
                                            battlefield[a + 1][b - 1] = 111;
                                            battlefield[a + 2][b] = 0;
                                            battlefield[a + 2][b - 1] = 111;
                                            battlefield[a + 3][b] = 111;
                                            battlefield[a + 3][b - 1] = 111;
                                            System.out.println("3 прав верх 3");
                                            break;
                                        }
                                        else {
                                            battlefield[a][b] = 0;
                                            battlefield[a][b - 1] = 111;
                                            battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 0;
                                            battlefield[a + 1][b - 1] = 111;
                                            battlefield[a + 1][b + 1] = 111;
                                            battlefield[a + 2][b] = 0;
                                            battlefield[a + 2][b - 1] = 111;
                                            battlefield[a + 2][b + 1] = 111;
                                            battlefield[a + 3][b] = 111;
                                            battlefield[a + 3][b - 1] = 111;
                                            battlefield[a + 3][b + 1] = 111;
                                            battlefield[a - 1][b] = 111;
                                            battlefield[a - 1][b - 1] = 111;
                                            battlefield[a - 1][b + 1] = 111;
                                            System.out.println("3 прав верх 4");
                                            break;
                                        }
                            }

                        }
             }
        }}
            for (int j = 0; j < battleship.decks.length; j++) {
            System.out.print(" " + battleship.decks[j]);
        }
        System.out.println();
        for (int j = 0; j < heavyCruiser1.decks.length; j++) {
            System.out.print(" " + heavyCruiser1.decks[j]);
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
