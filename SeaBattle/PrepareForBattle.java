package Homework.SeaBattle;

import java.util.Random;

public class PrepareForBattle {

        public Battleship battleship;
        public HeavyCruiser heavyCruiser1;
        public HeavyCruiser heavyCruiser2;
        public LightCruiser lightCruiser1;
        public LightCruiser lightCruiser2;
        public LightCruiser lightCruiser3;
        public Destroyer destroyer1;
        public Destroyer destroyer2;
        public Destroyer destroyer3;
        public Destroyer destroyer4;
        public int[][] battlefield = new int[10][10];

    public LightCruiser getLightCruiser1() {
        return lightCruiser1;
    }

    public void setLightCruiser1(LightCruiser lightCruiser1) {
        this.lightCruiser1 = lightCruiser1;
    }

    public LightCruiser getLightCruiser2() {
        return lightCruiser2;
    }

    public void setLightCruiser2(LightCruiser lightCruiser2) {
        this.lightCruiser2 = lightCruiser2;
    }

    public LightCruiser getLightCruiser3() {
        return lightCruiser3;
    }

    public void setLightCruiser3(LightCruiser lightCruiser3) {
        this.lightCruiser3 = lightCruiser3;
    }

    public Destroyer getDestroyer1() {
        return destroyer1;
    }

    public void setDestroyer1(Destroyer destroyer1) {
        this.destroyer1 = destroyer1;
    }

    public Destroyer getDestroyer2() {
        return destroyer2;
    }

    public void setDestroyer2(Destroyer destroyer2) {
        this.destroyer2 = destroyer2;
    }

    public Destroyer getDestroyer3() {
        return destroyer3;
    }

    public void setDestroyer3(Destroyer destroyer3) {
        this.destroyer3 = destroyer3;
    }

    public Destroyer getDestroyer4() {
        return destroyer4;
    }

    public void setDestroyer4(Destroyer destroyer4) {
        this.destroyer4 = destroyer4;
    }

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


    public PrepareForBattle(Battleship battleship, HeavyCruiser heavyCruiser1, HeavyCruiser heavyCruiser2,
                            LightCruiser lightCruiser1, LightCruiser lightCruiser2, LightCruiser lightCruiser3,
                            Destroyer destroyer1, Destroyer destroyer2, Destroyer destroyer3, Destroyer destroyer4) {
        this.battleship = battleship;
        this.heavyCruiser1 = heavyCruiser1;
        this.heavyCruiser2 = heavyCruiser2;
        this.lightCruiser1 = lightCruiser1;
        this.lightCruiser2 = lightCruiser2;
        this.lightCruiser3 = lightCruiser3;
        this.destroyer1 = destroyer1;
        this.destroyer2 = destroyer2;
        this.destroyer3 = destroyer3;
        this.destroyer4 = destroyer4;
    }

    public void prepare() {
            Random random = new Random();

            for (int i = 0; i < battlefield.length; ++i) {
                for (int j = 0; j < battlefield.length; ++j) {
                    battlefield[i][j] = (i * 10) + j + 1;
//                    System.out.print("  " + battlefield[i][j]);
                }
//                System.out.println();
            }
            //fixme очень много условий для расстановки,даже одного корабля получается
//расстановка кораблей начиная с большего
//        battleship
            int a = random.nextInt(10);//рандомятся координаты
            int b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            for (int i = 0; i < battleship.decks.length; i++) {
                if (battlefield[a][b] != 0 && i < 1) {
                    battleship.decks[i] = battlefield[a][b];//обозначается начало коробля

                }
                if (a > 5 && b > 5) {           //расстановка с условиями чтоб не выйти за рамки
                    for (int j = 1, s = 1; j < battleship.decks.length; s++, j++) {
                        battlefield[a][b] = battlefield[a - s][b];
                        battleship.decks[j] = battlefield[a][b];
                    }
                    if (a == 9 && b != 9) {    //ограждение вокруг корабля,куданельзя ставить др(111 - клетки вокруг)
                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;// 0 - корабль на поле
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
                else if (a > 5 && b < 6) {
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
                    }else if (a<6 && b<6){
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
               else if (a<6 && b>5){
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
//            heavyCruiser fixme сделать условия не наложения корабля на корабль(while работает не совсем корректно)
//                          и пока не повторяет цикл,если рандом непопадает в условия
while ((battlefield[a][b] == 0 || battlefield[a][b] == 111 || battlefield[a - 1][b] == 0 || battlefield[a - 1][b] == 111
        || battlefield[a - 2][b] == 0 || battlefield[a - 2][b] == 111)){  // при такой проверке иногда выходит за границы поля
         a = random.nextInt(10);
         b = random.nextInt(10);
        System.out.println(battlefield[a][b]);
        int count = 0;
        for (int i = 0,st = 0; i < heavyCruiser1.decks.length; i++) {
            if (battlefield[a][b] != 0 && battlefield[a][b] != 111 && i < 1) {
                st = battlefield[a][b];

            if (a > 5 && b > 5) {
                if (battlefield[a - 1][b] != 0 && battlefield[a - 1][b] != 111 && battlefield[a - 2][b] != 0 &&
                        battlefield[a - 2][b] != 111) {
                    count++;
                    heavyCruiser1.decks[0] = st;
                    heavyCruiser1.decks[1] = st - 10;
                    heavyCruiser1.decks[2] = st - 20;
                    if (a == 9 && b != 9) {    //ограждение корабля,куданельзя ставить др
                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                        battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                        battlefield[a - 3][b] = 111;battlefield[a - 3][b - 1] = 111;battlefield[a - 3][b + 1] = 111;
                        System.out.println("3 право низ 1");
                        break;
                    }
                    else
                        if (a != 9 && b == 9) {
                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                            battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                            battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;
                            battlefield[a - 3][b] = 111;battlefield[a - 3][b - 1] = 111;
                            battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                            System.out.println("3 право низ 2");
                            break;
                        }
                        else
                            if (a == 9 && b == 9) {
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;
                                battlefield[a - 3][b] = 111;battlefield[a - 3][b - 1] = 111;
                                System.out.println("3 право низ 3");
                                break;
                            }
                            else {
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                battlefield[a - 3][b] = 111;battlefield[a - 3][b - 1] = 111;battlefield[a - 3][b + 1] = 111;
                                battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                                System.out.println("3 право низ 4");
                                break;
                            }
                }
            }
            else
                if (a > 5 && b < 6) {
                    if (battlefield[a][b + 1] != 0 && battlefield[a][b + 1] != 111 && battlefield[a][b + 2] != 0 &&
                            battlefield[a][b + 2] != 111) {
                        count++;
                        heavyCruiser1.decks[0] = st;
                        heavyCruiser1.decks[1] = st + 1;
                        heavyCruiser1.decks[2] = st + 2;
                        if (a == 9 && b != 0) {
                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                            battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;
                            battlefield[a][b + 3] = 111;battlefield[a - 1][b + 3] = 111;
                            battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                            System.out.println("3 лев низ 1");
                            break;
                        }
                        else
                            if (a != 9 && b == 0) {
                                battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                battlefield[a + 1][b] = 111;battlefield[a][b + 1] = 0;
                                battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;
                                battlefield[a + 1][b + 2] = 111;battlefield[a][b + 3] = 111;
                                battlefield[a - 1][b + 3] = 111;battlefield[a + 1][b + 3] = 111;
                                System.out.println("3 лев низ 2");
                                break;
                            }
                            else
                                if (a == 9 && b == 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                    battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;
                                    battlefield[a][b + 3] = 111;battlefield[a - 1][b + 3] = 111;
                                    System.out.println("3 лев низ 3");
                                    break;
                                }
                                else {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                    battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                    battlefield[a][b + 3] = 111;battlefield[a - 1][b + 3] = 111;battlefield[a + 1][b + 3] = 111;
                                    battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                    System.out.println("3 лев низ 4");
                                    break;
                                }
                    }
                }
                else
                    if (a < 6 && b < 6) {
                        if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111 && battlefield[a + 2][b] != 0 &&
                                battlefield[a + 2][b] != 111) {
                            count++;
                            heavyCruiser1.decks[0] = st;
                            heavyCruiser1.decks[1] = st + 10;
                            heavyCruiser1.decks[2] = st + 20;
                            if (a != 0 && b == 0) {
                                battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                battlefield[a + 1][b] = 0;battlefield[a - 1][b + 1] = 111;
                                battlefield[a + 2][b] = 0;battlefield[a - 1][b + 1] = 111;
                                battlefield[a + 3][b] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a - 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                System.out.println("3 лев верх 1");
                                break;
                            }
                            else
                                if (a == 0 && b != 0) {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                    battlefield[a][b + 1] = 111;battlefield[a + 1][b] = 0;
                                    battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                    battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;
                                    battlefield[a + 2][b + 1] = 111;battlefield[a + 3][b] = 111;
                                    battlefield[a + 3][b - 1] = 111;battlefield[a + 3][b + 1] = 111;
                                    System.out.println("3 лев верх 2");
                                    break;
                                }
                                else
                                    if (a == 0 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 0;battlefield[a][b + 1] = 111;
                                        battlefield[a + 2][b] = 0;battlefield[a][b + 1] = 111;
                                        battlefield[a + 3][b] = 111;battlefield[a][b + 1] = 111;
                                        System.out.println("3 лев верх 3");
                                        break;
                                    }
                                    else {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                        battlefield[a + 3][b] = 111;battlefield[a + 3][b - 1] = 111;battlefield[a + 3][b + 1] = 111;
                                        battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                        System.out.println("3 лев верх 4");
                                        break;
                                    }
                        }

                    }
                    else
                        if (a < 6 && b > 5) {
                            if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111 && battlefield[a + 2][b] != 0 &&
                                    battlefield[a + 2][b] != 111) {
                                count++;
                                heavyCruiser1.decks[0] = st;
                                heavyCruiser1.decks[1] = st + 10;
                                heavyCruiser1.decks[2] = st + 20;
                                if (a != 0 && b == 9) {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                    battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;
                                    battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;
                                    battlefield[a + 3][b] = 111;battlefield[a + 3][b - 1] = 111;
                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                    System.out.println("3 прав верх 1");
                                    break;
                                }
                                else
                                    if (a == 0 && b != 9) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                        battlefield[a + 3][b] = 111;battlefield[a + 3][b - 1] = 111;battlefield[a + 3][b + 1] = 111;
                                        System.out.println("3 прав верх 2");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b == 9) {
                                            battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;
                                            battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;
                                            battlefield[a + 3][b] = 111;battlefield[a + 3][b - 1] = 111;
                                            System.out.println("3 прав верх 3");
                                            break;
                                        }
                                        else {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                            battlefield[a + 3][b] = 111;battlefield[a + 3][b - 1] = 111;battlefield[a + 3][b + 1] = 111;
                                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                            System.out.println("3 прав верх 4");
                                            break;
                                        }
                            }

                        }
             }
        } if (count==1){break;}}
//          fixme 2й крейсер
        while ((battlefield[a][b] == 0 || battlefield[a][b] == 111 || battlefield[a - 1][b] == 0 || battlefield[a - 1][b] == 111
                || battlefield[a - 2][b] == 0 || battlefield[a - 2][b] == 111)){  // при такой проверке иногда выходит за границы поля
            a = random.nextInt(10);
            b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            int count = 0;
            for (int i = 0,st = 0; i < heavyCruiser2.decks.length; i++) {
                if (battlefield[a][b] != 0 && battlefield[a][b] != 111 && i < 1) {
                    st = battlefield[a][b];

                    if (a > 5 && b > 5) {
                        if (battlefield[a - 1][b] != 0 && battlefield[a - 1][b] != 111 && battlefield[a - 2][b] != 0 &&
                                battlefield[a - 2][b] != 111) {
                            count++;
                            heavyCruiser2.decks[0] = st;
                            heavyCruiser2.decks[1] = st - 10;
                            heavyCruiser2.decks[2] = st - 20;
                            if (a == 9 && b != 9) {    //ограждение корабля,куданельзя ставить др
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                battlefield[a - 3][b] = 111;battlefield[a - 3][b - 1] = 111;battlefield[a - 3][b + 1] = 111;
                                System.out.println("3 право низ 1");
                                break;
                            }
                            else
                                if (a != 9 && b == 9) {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                    battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                    battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;
                                    battlefield[a - 3][b] = 111;battlefield[a - 3][b - 1] = 111;
                                    battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                                    System.out.println("3 право низ 2");
                                    break;
                                }
                                else
                                    if (a == 9 && b == 9) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                        battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;
                                        battlefield[a - 3][b] = 111;battlefield[a - 3][b - 1] = 111;
                                        System.out.println("3 право низ 3");
                                        break;
                                    }
                                    else {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a - 2][b] = 0;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                        battlefield[a - 3][b] = 111;battlefield[a - 3][b - 1] = 111;battlefield[a - 3][b + 1] = 111;
                                        battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                                        System.out.println("3 право низ 4");
                                        break;
                                    }
                        }
                    }
                    else
                        if (a > 5 && b < 6) {
                            if (battlefield[a][b + 1] != 0 && battlefield[a][b + 1] != 111 && battlefield[a][b + 2] != 0 &&
                                    battlefield[a][b + 2] != 111) {
                                count++;
                                heavyCruiser2.decks[0] = st;
                                heavyCruiser2.decks[1] = st + 1;
                                heavyCruiser2.decks[2] = st + 2;
                                if (a == 9 && b != 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                    battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;
                                    battlefield[a][b + 3] = 111;battlefield[a - 1][b + 3] = 111;
                                    battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                                    System.out.println("3 лев низ 1");
                                    break;
                                }
                                else
                                    if (a != 9 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                        battlefield[a + 1][b] = 111;battlefield[a][b + 1] = 0;
                                        battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;
                                        battlefield[a + 1][b + 2] = 111;battlefield[a][b + 3] = 111;
                                        battlefield[a - 1][b + 3] = 111;battlefield[a + 1][b + 3] = 111;
                                        System.out.println("3 лев низ 2");
                                        break;
                                    }
                                    else
                                        if (a == 9 && b == 0) {
                                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                            battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;
                                            battlefield[a][b + 3] = 111;battlefield[a - 1][b + 3] = 111;
                                            System.out.println("3 лев низ 3");
                                            break;
                                        }
                                        else {
                                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a][b + 2] = 0;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                            battlefield[a][b + 3] = 111;battlefield[a - 1][b + 3] = 111;battlefield[a + 1][b + 3] = 111;
                                            battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                            System.out.println("3 лев низ 4");
                                            break;
                                        }
                            }
                        }
                        else
                            if (a < 6 && b < 6) {
                                if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111 && battlefield[a + 2][b] != 0 &&
                                        battlefield[a + 2][b] != 111) {
                                    count++;
                                    heavyCruiser2.decks[0] = st;
                                    heavyCruiser2.decks[1] = st + 10;
                                    heavyCruiser2.decks[2] = st + 20;
                                    if (a != 0 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 0;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a + 2][b] = 0;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a + 3][b] = 111;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a - 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                        System.out.println("3 лев верх 1");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b != 0) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                            battlefield[a][b + 1] = 111;battlefield[a + 1][b] = 0;
                                            battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;
                                            battlefield[a + 2][b + 1] = 111;battlefield[a + 3][b] = 111;
                                            battlefield[a + 3][b - 1] = 111;battlefield[a + 3][b + 1] = 111;
                                            System.out.println("3 лев верх 2");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b == 0) {
                                                battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 2][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 3][b] = 111;battlefield[a][b + 1] = 111;
                                                System.out.println("3 лев верх 3");
                                                break;
                                            }
                                            else {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                battlefield[a + 3][b] = 111;battlefield[a + 3][b - 1] = 111;battlefield[a + 3][b + 1] = 111;
                                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                System.out.println("3 лев верх 4");
                                                break;
                                            }
                                }

                            }
                            else
                                if (a < 6 && b > 5) {
                                    if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111 && battlefield[a + 2][b] != 0 &&
                                            battlefield[a + 2][b] != 111) {
                                        count++;
                                        heavyCruiser2.decks[0] = st;
                                        heavyCruiser2.decks[1] = st + 10;
                                        heavyCruiser2.decks[2] = st + 20;
                                        if (a != 0 && b == 9) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                            battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;
                                            battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;
                                            battlefield[a + 3][b] = 111;battlefield[a + 3][b - 1] = 111;
                                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                            System.out.println("3 прав верх 1");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b != 9) {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                battlefield[a + 3][b] = 111;battlefield[a + 3][b - 1] = 111;battlefield[a + 3][b + 1] = 111;
                                                System.out.println("3 прав верх 2");
                                                break;
                                            }
                                            else
                                                if (a == 0 && b == 9) {
                                                    battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                    battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;
                                                    battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;
                                                    battlefield[a + 3][b] = 111;battlefield[a + 3][b - 1] = 111;
                                                    System.out.println("3 прав верх 3");
                                                    break;
                                                }
                                                else {
                                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                    battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                    battlefield[a + 2][b] = 0;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                    battlefield[a + 3][b] = 111;battlefield[a + 3][b - 1] = 111;battlefield[a + 3][b + 1] = 111;
                                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                    System.out.println("3 прав верх 4");
                                                    break;
                                                }
                                    }

                                }
                }
            } if (count==1){break;}}
        // fixme Легкий крейсер

        while ((battlefield[a][b] == 0 || battlefield[a][b] == 111 || battlefield[a - 1][b] == 0 ||
                battlefield[a - 1][b] == 111)){
            a = random.nextInt(10);
            b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            int count = 0;
            for (int i = 0,st = 0; i < lightCruiser1.decks.length; i++) {
                if (battlefield[a][b] != 0 && battlefield[a][b] != 111 && i < 1) {
                    st = battlefield[a][b];

                    if (a > 5 && b > 5) {
                        if (battlefield[a - 1][b] != 0 && battlefield[a - 1][b] != 111) {
                            count++;
                            lightCruiser1.decks[0] = st;
                            lightCruiser1.decks[1] = st - 10;
                            if (a == 9 && b != 9) {    //ограждение корабля,куданельзя ставить др
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                System.out.println("3 право низ 1");
                                break;
                            }
                            else
                                if (a != 9 && b == 9) {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                    battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                    battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;
                                    battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                                    System.out.println("3 право низ 2");
                                    break;
                                }
                                else
                                    if (a == 9 && b == 9) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                        battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;
                                        System.out.println("3 право низ 3");
                                        break;
                                    }
                                    else {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                        battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                                        System.out.println("3 право низ 4");
                                        break;
                                    }
                        }
                    }
                    else
                        if (a > 5 && b < 6) {
                            if (battlefield[a][b + 1] != 0 && battlefield[a][b + 1] != 111) {
                                count++;
                                lightCruiser1.decks[0] = st;
                                lightCruiser1.decks[1] = st + 1;
                                if (a == 9 && b != 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                    battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;
                                    battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                                    System.out.println("3 лев низ 1");
                                    break;
                                }
                                else
                                    if (a != 9 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                        battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                        System.out.println("3 лев низ 2");
                                        break;
                                    }
                                    else
                                        if (a == 9 && b == 0) {
                                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                            battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;
                                            System.out.println("3 лев низ 3");
                                            break;
                                        }
                                        else {
                                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                            battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                            System.out.println("3 лев низ 4");
                                            break;
                                        }
                            }
                        }
                        else
                            if (a < 6 && b < 6) {
                                if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111) {
                                    count++;
                                    lightCruiser1.decks[0] = st;
                                    lightCruiser1.decks[1] = st + 10;
                                    if (a != 0 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 0;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a + 2][b] = 111;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a - 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                        System.out.println("3 лев верх 1");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b != 0) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                            System.out.println("3 лев верх 2");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b == 0) {
                                                battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 2][b] = 111;battlefield[a][b + 1] = 111;
                                                System.out.println("3 лев верх 3");
                                                break;
                                            }
                                            else {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                System.out.println("3 лев верх 4");
                                                break;
                                            }
                                }

                            }
                            else
                                if (a < 6 && b > 5) {
                                    if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111)
                                             {
                                        count++;
                                        lightCruiser1.decks[0] = st;
                                        lightCruiser1.decks[1] = st + 10;
                                        if (a != 0 && b == 9) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                            battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;
                                            battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;
                                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                            System.out.println("3 прав верх 1");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b != 9) {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                System.out.println("3 прав верх 2");
                                                break;
                                            }
                                            else
                                                if (a == 0 && b == 9) {
                                                    battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                    battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;
                                                    battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;

                                                    System.out.println("3 прав верх 3");
                                                    break;
                                                }
                                                else {
                                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                    battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                    battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                    System.out.println("3 прав верх 4");
                                                    break;
                                                }
                                    }

                                }
                }
            } if (count==1){break;}}

        while ((battlefield[a][b] == 0 || battlefield[a][b] == 111 || battlefield[a - 1][b] == 0 ||
                battlefield[a - 1][b] == 111)){
            a = random.nextInt(10);
            b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            int count = 0;
            for (int i = 0,st = 0; i < lightCruiser2.decks.length; i++) {
                if (battlefield[a][b] != 0 && battlefield[a][b] != 111 && i < 1) {
                    st = battlefield[a][b];

                    if (a > 5 && b > 5) {
                        if (battlefield[a - 1][b] != 0 && battlefield[a - 1][b] != 111) {
                            count++;
                            lightCruiser2.decks[0] = st;
                            lightCruiser2.decks[1] = st - 10;
                            if (a == 9 && b != 9) {    //ограждение корабля,куданельзя ставить др
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                System.out.println("3 право низ 1");
                                break;
                            }
                            else
                                if (a != 9 && b == 9) {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                    battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                    battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;
                                    battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                                    System.out.println("3 право низ 2");
                                    break;
                                }
                                else
                                    if (a == 9 && b == 9) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                        battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;
                                        System.out.println("3 право низ 3");
                                        break;
                                    }
                                    else {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                        battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                                        System.out.println("3 право низ 4");
                                        break;
                                    }
                        }
                    }
                    else
                        if (a > 5 && b < 6) {
                            if (battlefield[a][b + 1] != 0 && battlefield[a][b + 1] != 111) {
                                count++;
                                lightCruiser2.decks[0] = st;
                                lightCruiser2.decks[1] = st + 1;
                                if (a == 9 && b != 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                    battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;
                                    battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                                    System.out.println("3 лев низ 1");
                                    break;
                                }
                                else
                                    if (a != 9 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                        battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                        System.out.println("3 лев низ 2");
                                        break;
                                    }
                                    else
                                        if (a == 9 && b == 0) {
                                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                            battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;
                                            System.out.println("3 лев низ 3");
                                            break;
                                        }
                                        else {
                                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                            battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                            System.out.println("3 лев низ 4");
                                            break;
                                        }
                            }
                        }
                        else
                            if (a < 6 && b < 6) {
                                if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111) {
                                    count++;
                                    lightCruiser2.decks[0] = st;
                                    lightCruiser2.decks[1] = st + 10;
                                    if (a != 0 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 0;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a + 2][b] = 111;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a - 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                        System.out.println("3 лев верх 1");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b != 0) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                            System.out.println("3 лев верх 2");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b == 0) {
                                                battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 2][b] = 111;battlefield[a][b + 1] = 111;
                                                System.out.println("3 лев верх 3");
                                                break;
                                            }
                                            else {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                System.out.println("3 лев верх 4");
                                                break;
                                            }
                                }

                            }
                            else
                                if (a < 6 && b > 5) {
                                    if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111)
                                    {
                                        count++;
                                        lightCruiser2.decks[0] = st;
                                        lightCruiser2.decks[1] = st + 10;
                                        if (a != 0 && b == 9) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                            battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;
                                            battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;
                                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                            System.out.println("3 прав верх 1");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b != 9) {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                System.out.println("3 прав верх 2");
                                                break;
                                            }
                                            else
                                                if (a == 0 && b == 9) {
                                                    battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                    battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;
                                                    battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;

                                                    System.out.println("3 прав верх 3");
                                                    break;
                                                }
                                                else {
                                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                    battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                    battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                    System.out.println("3 прав верх 4");
                                                    break;
                                                }
                                    }

                                }
                }
            } if (count==1){break;}}

        while ((battlefield[a][b] == 0 || battlefield[a][b] == 111 || battlefield[a - 1][b] == 0 ||
                battlefield[a - 1][b] == 111)){
            a = random.nextInt(10);
            b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            int count = 0;
            for (int i = 0,st = 0; i < lightCruiser3.decks.length; i++) {
                if (battlefield[a][b] != 0 && battlefield[a][b] != 111 && i < 1) {
                    st = battlefield[a][b];

                    if (a > 5 && b > 5) {
                        if (battlefield[a - 1][b] != 0 && battlefield[a - 1][b] != 111) {
                            count++;
                            lightCruiser3.decks[0] = st;
                            lightCruiser3.decks[1] = st - 10;
                            if (a == 9 && b != 9) {    //ограждение корабля,куданельзя ставить др
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                System.out.println("3 право низ 1");
                                break;
                            }
                            else
                                if (a != 9 && b == 9) {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                    battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                    battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;
                                    battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                                    System.out.println("3 право низ 2");
                                    break;
                                }
                                else
                                    if (a == 9 && b == 9) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;
                                        battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;
                                        System.out.println("3 право низ 3");
                                        break;
                                    }
                                    else {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                        battlefield[a - 1][b] = 0;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a - 2][b] = 111;battlefield[a - 2][b - 1] = 111;battlefield[a - 2][b + 1] = 111;
                                        battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                                        System.out.println("3 право низ 4");
                                        break;
                                    }
                        }
                    }
                    else
                        if (a > 5 && b < 6) {
                            if (battlefield[a][b + 1] != 0 && battlefield[a][b + 1] != 111) {
                                count++;
                                lightCruiser3.decks[0] = st;
                                lightCruiser3.decks[1] = st + 1;
                                if (a == 9 && b != 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                    battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;
                                    battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                                    System.out.println("3 лев низ 1");
                                    break;
                                }
                                else
                                    if (a != 9 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                        battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                        System.out.println("3 лев низ 2");
                                        break;
                                    }
                                    else
                                        if (a == 9 && b == 0) {
                                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;
                                            battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;
                                            System.out.println("3 лев низ 3");
                                            break;
                                        }
                                        else {
                                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                            battlefield[a][b + 1] = 0;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a][b + 2] = 111;battlefield[a - 1][b + 2] = 111;battlefield[a + 1][b + 2] = 111;
                                            battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                            System.out.println("3 лев низ 4");
                                            break;
                                        }
                            }
                        }
                        else
                            if (a < 6 && b < 6) {
                                if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111) {
                                    count++;
                                    lightCruiser3.decks[0] = st;
                                    lightCruiser3.decks[1] = st + 10;
                                    if (a != 0 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 0;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a + 2][b] = 111;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a - 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                        System.out.println("3 лев верх 1");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b != 0) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                            System.out.println("3 лев верх 2");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b == 0) {
                                                battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 2][b] = 111;battlefield[a][b + 1] = 111;
                                                System.out.println("3 лев верх 3");
                                                break;
                                            }
                                            else {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                System.out.println("3 лев верх 4");
                                                break;
                                            }
                                }

                            }
                            else
                                if (a < 6 && b > 5) {
                                    if (battlefield[a + 1][b] != 0 && battlefield[a + 1][b] != 111)
                                    {
                                        count++;
                                        lightCruiser3.decks[0] = st;
                                        lightCruiser3.decks[1] = st + 10;
                                        if (a != 0 && b == 9) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                            battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;
                                            battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;
                                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                            System.out.println("3 прав верх 1");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b != 9) {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                System.out.println("3 прав верх 2");
                                                break;
                                            }
                                            else
                                                if (a == 0 && b == 9) {
                                                    battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                    battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;
                                                    battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;

                                                    System.out.println("3 прав верх 3");
                                                    break;
                                                }
                                                else {
                                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                    battlefield[a + 1][b] = 0;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                    battlefield[a + 2][b] = 111;battlefield[a + 2][b - 1] = 111;battlefield[a + 2][b + 1] = 111;
                                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                    System.out.println("3 прав верх 4");
                                                    break;
                                                }
                                    }

                                }
                }
            } if (count==1){break;}}
        // fixme однопалубные эсминцы

        while ((battlefield[a][b] == 0 || battlefield[a][b] == 111)){
            a = random.nextInt(10);
            b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            int count = 0;
            for (int i = 0,st = 0; i < destroyer1.decks.length; i++) {
                if (battlefield[a][b] != 0 && battlefield[a][b] != 111 && i < 1) {
                    st = battlefield[a][b];

                    if (a > 5 && b > 5) {
                            count++;
                            destroyer1.decks[0] = st;
                            if (a == 9 && b != 9) {    //ограждение корабля,куданельзя ставить др
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                System.out.println("3 право низ 1");
                                break;
                            }
                            else
                                if (a != 9 && b == 9) {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                    battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                                    System.out.println("3 право низ 2");
                                    break;
                                }
                                else
                                    if (a == 9 && b == 9) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                        battlefield[a - 1][b] = 1;battlefield[a - 1][b - 1] = 111;
                                        System.out.println("3 право низ 3");
                                        break;
                                    }
                                    else {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                        battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                                        System.out.println("3 право низ 4");
                                        break;
                                    }
                    }
                    else
                        if (a > 5 && b < 6) {
                                count++;
                                destroyer1.decks[0] = st;
                                if (a == 9 && b != 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                    battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                                    System.out.println("3 лев низ 1");
                                    break;
                                }
                                else
                                    if (a != 9 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                        battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        System.out.println("3 лев низ 2");
                                        break;
                                    }
                                    else
                                        if (a == 9 && b == 0) {
                                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                            battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;
                                            System.out.println("3 лев низ 3");
                                            break;
                                        }
                                        else {
                                            battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                            battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                            System.out.println("3 лев низ 4");
                                            break;
                                        }
                        }
                        else
                            if (a < 6 && b < 6) {
                                    count++;
                                    destroyer1.decks[0] = st;
                                    if (a != 0 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                        battlefield[a - 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                        System.out.println("3 лев верх 1");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b != 0) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            System.out.println("3 лев верх 2");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b == 0) {
                                                battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 111;battlefield[a][b + 1] = 111;
                                                System.out.println("3 лев верх 3");
                                                break;
                                            }
                                            else {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                System.out.println("3 лев верх 4");
                                                break;
                                            }

                            }
                            else
                                if (a < 6 && b > 5) {
                                        count++;
                                        destroyer1.decks[0] = st;
                                        if (a != 0 && b == 9) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;
                                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                            System.out.println("3 прав верх 1");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b != 9) {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                System.out.println("3 прав верх 2");
                                                break;
                                            }
                                            else
                                                if (a == 0 && b == 9) {
                                                    battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                    battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;


                                                    System.out.println("3 прав верх 3");
                                                    break;
                                                }
                                                else {
                                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                    battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                    System.out.println("3 прав верх 4");
                                                    break;
                                                }


                                }
                }
            } if (count==1){break;}}

        while ((battlefield[a][b] == 0 || battlefield[a][b] == 111)){
            a = random.nextInt(10);
            b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            int count = 0;
            for (int i = 0,st = 0; i < destroyer2.decks.length; i++) {
                if (battlefield[a][b] != 0 && battlefield[a][b] != 111 && i < 1) {
                    st = battlefield[a][b];

                    if (a > 5 && b > 5) {
                        count++;
                        destroyer2.decks[0] = st;
                        if (a == 9 && b != 9) {    //ограждение корабля,куданельзя ставить др
                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                            System.out.println("1 право низ 1");
                            break;
                        }
                        else
                            if (a != 9 && b == 9) {
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                                System.out.println("1 право низ 2");
                                break;
                            }
                            else
                                if (a == 9 && b == 9) {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                    battlefield[a - 1][b] = 1;battlefield[a - 1][b - 1] = 111;
                                    System.out.println("1 право низ 3");
                                    break;
                                }
                                else {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                                    System.out.println("1 право низ 4");
                                    break;
                                }
                    }
                    else
                        if (a > 5 && b < 6) {
                            count++;
                            destroyer2.decks[0] = st;
                            if (a == 9 && b != 0) {
                                battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                                System.out.println("1 лев низ 1");
                                break;
                            }
                            else
                                if (a != 9 && b == 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                    battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                    System.out.println("1 лев низ 2");
                                    break;
                                }
                                else
                                    if (a == 9 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                        battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;
                                        System.out.println("1 лев низ 3");
                                        break;
                                    }
                                    else {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                        battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                        System.out.println("1 лев низ 4");
                                        break;
                                    }
                        }
                        else
                            if (a < 6 && b < 6) {
                                count++;
                                destroyer2.decks[0] = st;
                                if (a != 0 && b == 0) {
                                    battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                    battlefield[a + 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                    System.out.println("1 лев верх 1");
                                    break;
                                }
                                else
                                    if (a == 0 && b != 0) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        System.out.println("1 лев верх 2");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b == 0) {
                                            battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a][b + 1] = 111;
                                            System.out.println("1 лев верх 3");
                                            break;
                                        }
                                        else {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                            System.out.println("1 лев верх 4");
                                            break;
                                        }

                            }
                            else
                                if (a < 6 && b > 5) {
                                    count++;
                                    destroyer2.decks[0] = st;
                                    if (a != 0 && b == 9) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                        battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;
                                        battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                        System.out.println("1 прав верх 1");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b != 9) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            System.out.println("1 прав верх 2");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b == 9) {
                                                battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;
                                                System.out.println("1 прав верх 3");
                                                break;
                                            }
                                            else {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                System.out.println("1 прав верх 4");
                                                break;
                                            }
                                }
                }
            } if (count==1){break;}}

        while ((battlefield[a][b] == 0 || battlefield[a][b] == 111)){
            a = random.nextInt(10);
            b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            int count = 0;
            for (int i = 0,st = 0; i < destroyer3.decks.length; i++) {
                if (battlefield[a][b] != 0 && battlefield[a][b] != 111 && i < 1) {
                    st = battlefield[a][b];

                    if (a > 5 && b > 5) {
                        count++;
                        destroyer3.decks[0] = st;
                        if (a == 9 && b != 9) {    //ограждение корабля,куданельзя ставить др
                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                            System.out.println("3 право низ 1");
                            break;
                        }
                        else
                            if (a != 9 && b == 9) {
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                                System.out.println("3 право низ 2");
                                break;
                            }
                            else
                                if (a == 9 && b == 9) {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                    battlefield[a - 1][b] = 1;battlefield[a - 1][b - 1] = 111;
                                    System.out.println("3 право низ 3");
                                    break;
                                }
                                else {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                                    System.out.println("3 право низ 4");
                                    break;
                                }
                    }
                    else
                        if (a > 5 && b < 6) {
                            count++;
                            destroyer3.decks[0] = st;
                            if (a == 9 && b != 0) {
                                battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                                System.out.println("3 лев низ 1");
                                break;
                            }
                            else
                                if (a != 9 && b == 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                    battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                    System.out.println("3 лев низ 2");
                                    break;
                                }
                                else
                                    if (a == 9 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                        battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;
                                        System.out.println("3 лев низ 3");
                                        break;
                                    }
                                    else {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                        battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                        System.out.println("3 лев низ 4");
                                        break;
                                    }
                        }
                        else
                            if (a < 6 && b < 6) {
                                count++;
                                destroyer3.decks[0] = st;
                                if (a != 0 && b == 0) {
                                    battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                    battlefield[a + 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                    System.out.println("3 лев верх 1");
                                    break;
                                }
                                else
                                    if (a == 0 && b != 0) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        System.out.println("3 лев верх 2");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b == 0) {
                                            battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a][b + 1] = 111;
                                            System.out.println("3 лев верх 3");
                                            break;
                                        }
                                        else {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                            System.out.println("3 лев верх 4");
                                            break;
                                        }

                            }
                            else
                                if (a < 6 && b > 5) {
                                    count++;
                                    destroyer3.decks[0] = st;
                                    if (a != 0 && b == 9) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                        battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;
                                        battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                        System.out.println("3 прав верх 1");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b != 9) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            System.out.println("3 прав верх 2");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b == 9) {
                                                battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;


                                                System.out.println("3 прав верх 3");
                                                break;
                                            }
                                            else {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                System.out.println("3 прав верх 4");
                                                break;
                                            }


                                }
                }
            } if (count==1){break;}}

        while ((battlefield[a][b] == 0 || battlefield[a][b] == 111)){
            a = random.nextInt(10);
            b = random.nextInt(10);
            System.out.println(battlefield[a][b]);
            int count = 0;
            for (int i = 0,st = 0; i < destroyer4.decks.length; i++) {
                if (battlefield[a][b] != 0 && battlefield[a][b] != 111 && i < 1) {
                    st = battlefield[a][b];

                    if (a > 5 && b > 5) {
                        count++;
                        destroyer4.decks[0] = st;
                        if (a == 9 && b != 9) {    //ограждение корабля,куданельзя ставить др
                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                            System.out.println("1 право низ 1");
                            break;
                        }
                        else
                            if (a != 9 && b == 9) {
                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b] = 111;
                                System.out.println("1 право низ 2");
                                break;
                            }
                            else
                                if (a == 9 && b == 9) {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                    battlefield[a - 1][b] = 1;battlefield[a - 1][b - 1] = 111;
                                    System.out.println("1 право низ 3");
                                    break;
                                }
                                else {
                                    battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;battlefield[a + 1][b] = 111;
                                    System.out.println("1 право низ 4");
                                    break;
                                }
                    }
                    else
                        if (a > 5 && b < 6) {
                            count++;
                            destroyer4.decks[0] = st;
                            if (a == 9 && b != 0) {
                                battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;
                                battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;
                                System.out.println("1 лев низ 1");
                                break;
                            }
                            else
                                if (a != 9 && b == 0) {
                                    battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                    battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                    System.out.println("1 лев низ 2");
                                    break;
                                }
                                else
                                    if (a == 9 && b == 0) {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;
                                        battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;
                                        System.out.println("1 лев низ 3");
                                        break;
                                    }
                                    else {
                                        battlefield[a][b] = 0;battlefield[a - 1][b] = 111;battlefield[a + 1][b] = 111;
                                        battlefield[a][b + 1] = 111;battlefield[a - 1][b + 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        battlefield[a][b - 1] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a + 1][b - 1] = 111;
                                        System.out.println("1 лев низ 4");
                                        break;
                                    }
                        }
                        else
                            if (a < 6 && b < 6) {
                                count++;
                                destroyer4.decks[0] = st;
                                if (a != 0 && b == 0) {
                                    battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                    battlefield[a + 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                    battlefield[a - 1][b] = 111;battlefield[a - 1][b + 1] = 111;
                                    System.out.println("1 лев верх 1");
                                    break;
                                }
                                else
                                    if (a == 0 && b != 0) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                        battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                        System.out.println("1 лев верх 2");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b == 0) {
                                            battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a][b + 1] = 111;
                                            System.out.println("1 лев верх 3");
                                            break;
                                        }
                                        else {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                            System.out.println("1 лев верх 4");
                                            break;
                                        }

                            }
                            else
                                if (a < 6 && b > 5) {
                                    count++;
                                    destroyer4.decks[0] = st;
                                    if (a != 0 && b == 9) {
                                        battlefield[a][b] = 0;battlefield[a][b - 1] = 111;
                                        battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;
                                        battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;
                                        System.out.println("1 прав верх 1");
                                        break;
                                    }
                                    else
                                        if (a == 0 && b != 9) {
                                            battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                            battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                            System.out.println("1 прав верх 2");
                                            break;
                                        }
                                        else
                                            if (a == 0 && b == 9) {
                                                battlefield[a][b] = 0;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;
                                                System.out.println("1 прав верх 3");
                                                break;
                                            }
                                            else {
                                                battlefield[a][b] = 0;battlefield[a][b - 1] = 111;battlefield[a][b + 1] = 111;
                                                battlefield[a + 1][b] = 111;battlefield[a + 1][b - 1] = 111;battlefield[a + 1][b + 1] = 111;
                                                battlefield[a - 1][b] = 111;battlefield[a - 1][b - 1] = 111;battlefield[a - 1][b + 1] = 111;
                                                System.out.println("1 прав верх 4");
                                                break;
                                            }
                                }
                }
            } if (count==1){break;}}
        System.out.println("Линкор");
            for (int j = 0; j < battleship.decks.length; j++) {//координаты линкора
            System.out.print(" " + battleship.decks[j]);
        }
        System.out.println();
        System.out.println("Тяж крейсер 1");
        for (int j = 0; j < heavyCruiser1.decks.length; j++) {//координаты крейсера
            System.out.print(" " + heavyCruiser1.decks[j]);
        }
        System.out.println();
        System.out.println("Тяж крейсер 2");
        for (int j = 0; j < heavyCruiser2.decks.length; j++) {//координаты крейсера
            System.out.print(" " + heavyCruiser2.decks[j]);
        }System.out.println();

        System.out.println("Лег крейсер 1");
        for (int j = 0; j < lightCruiser1.decks.length; j++) {//координаты крейсера
            System.out.print(" " + lightCruiser1.decks[j]);
        }System.out.println();

        System.out.println("Лег крейсер 2");
        for (int j = 0; j < lightCruiser2.decks.length; j++) {//координаты крейсера
            System.out.print(" " + lightCruiser2.decks[j]);
        }System.out.println();

        System.out.println("Лег крейсер 3");
        for (int j = 0; j < lightCruiser3.decks.length; j++) {//координаты крейсера
            System.out.print(" " + lightCruiser3.decks[j]);
        }System.out.println();

        System.out.println("Эсмин 1");
        for (int j = 0; j < destroyer1.decks.length; j++) {//координаты крейсера
            System.out.print(" " + destroyer1.decks[j]);
        }System.out.println();

        System.out.println("Эсмин 2");
        for (int j = 0; j < destroyer2.decks.length; j++) {//координаты крейсера
            System.out.print(" " + destroyer2.decks[j]);
        }System.out.println();

        System.out.println("Эсмин 3");
        for (int j = 0; j < destroyer3.decks.length; j++) {//координаты крейсера
            System.out.print(" " + destroyer3.decks[j]);
        }System.out.println();

        System.out.println("Эсмин 4");
        for (int j = 0; j < destroyer4.decks.length; j++) {//координаты крейсера
            System.out.print(" " + destroyer4.decks[j]);
        }System.out.println();


            for (int i = 0; i < battlefield.length; ++i) {
                for (int j = 0; j < battlefield.length; ++j) {
                    System.out.print("   " + battlefield[i][j]);
                }
                System.out.println();
            }
        }
}
