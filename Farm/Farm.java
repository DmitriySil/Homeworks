package Homework.Farm;

import java.util.Random;

public class Farm {
    protected Pet[] pets = new Pet[10];
    protected Farmer farmer;
    protected Wild[] wilds = new Wild[5];

    public Farm(Farmer farmer) {
        this.farmer = farmer;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }

    public void addPet (Pet newPet){
        for (int i = 0; i < pets.length ; i++) {
            if (pets[i] == null){
                pets[i] = newPet;
                break;
            }

        }
    }

    public void addWild (Wild newWild){
        for (int i = 0; i <wilds.length ; i++) {
            if (wilds[i] == null){
                wilds[i] = newWild;
            break;}
        }
    }

    public void passDay(){
        int countPet,countDrAw0 = 0, countDrAw1 = 0, countDrAw2 = 0, driveAway,randomWild,randomPet,healthPet = 0,
        countDrAw3 = 0, countDrAw4 = 0;
        Random random = new Random();
//        System.out.println(farmer.resources);

        while (true) {


                randomWild = random.nextInt(5);
                if (wilds[randomWild].onFarm) {
                    randomPet = random.nextInt(10);
                    if (pets[randomPet].onFarm) {
                        System.out.println("Новый день");
                        System.out.println("Ресурсов на ферме  " + farmer.resources);
                        if (farmer.resources >= 2) {
                            farmer.eat();

                            driveAway = random.nextInt() * 101;

                            if (driveAway <= 70) {
                                if (wilds[randomWild].speed > pets[randomPet].speed) {
//                            System.out.println(pets[randomPet].health);
                                    healthPet = pets[randomPet].getHealth() - wilds[randomWild].getForce();

                                    if (healthPet <= 0) {
                                        pets[randomPet].setOnFarm(false);
                                        System.out.println(wilds[randomWild].getName() + " Съел "+pets[randomPet].getName()  );

                                    }
                                    else {
                                        pets[randomPet].setHealth(healthPet);
                                        System.out.println( wilds[randomWild].getName()+ " Ранил " + pets[randomPet].getName());
                                    }
                                    for (int i = 0; i < pets.length ; i++) {
                                        if (pets[i].onFarm && pets[i] instanceof CanFeed){
                                            System.out.println("Кормежка " + pets[i].getName() );
                                            farmer.feed(pets);
                                        }

                                    }

                                countPet = 0;
                                for (int i = 0; i < pets.length; i++) {
                                    if (pets[i].onFarm) {
                                        if (pets[i] instanceof GiveResources) {
                                            System.out.println("Фермер собирает ресурсы c " + pets[i].getName());
                                            farmer.resources += pets[i].getResources();
                                            countPet++;
                                        }
                                    }
                                }
                                for (int i = 0; i < pets.length; i++) {
                                    if (countPet == 0 && pets[i].onFarm && pets[i] instanceof CanEat) {
                                        farmer.resources += pets[i].getHealth();
                                        System.out.println("Фермер съел " + pets[i].getName());
                                        pets[i].setOnFarm(false);
                                    }
                                }
                                int countPet1 = 0;
                                for (int i = 0; i < pets.length; i++) {
                                    if(!pets[i].onFarm ){
                                    countPet1++;
                                    if (countPet1==10){
                                        System.out.println("Зверье закончилось,без кота и жизнь не та,фермер проиграл");
                                        return;
                                    }}}




                            }
                                else{
                                    System.out.println(pets[randomPet].getName() + " Убежал от "+ wilds[randomWild].getName() );
                                    for (int i = 0; i <pets.length ; i++) {
                                        if (pets[i].onFarm && pets[i] instanceof CanFeed){
                                            System.out.println("Кормежка "+ pets[i].getName());
                                            farmer.feed(pets);
                                        }

                                    }



                                    countPet = 0;
                                    for (int i = 0; i < pets.length; i++) {
                                        if (pets[i].onFarm) {
                                            if (pets[i] instanceof GiveResources) {
                                                System.out.println("Фермер собирает ресурсы с " + pets[i].getName());
                                                farmer.resources += pets[i].getResources();
                                                countPet++;
                                            }
                                        }
                                    }
                                    for (int i = 0; i < pets.length; i++) {
                                        if (countPet == 0 && pets[i].onFarm && pets[i] instanceof CanEat) {
                                            farmer.resources += pets[i].getHealth();
                                            System.out.println("Фермер съел" + pets[i].getName());
                                            pets[i].setOnFarm(false);



                                        }
                                    }
                                    int countPet1 = 0;
                                    for (int i = 0; i < pets.length; i++) {
                                        if(!pets[i].onFarm ){
                                            countPet1++;
                                            if (countPet1==10){
                                                System.out.println("Зверье закончилось,без кота и жизнь не та,фермер проиграл");
                                                return;
                                            }}}}
                            }
                            else {
                                switch (randomWild) {
                                    case 0:
                                        countDrAw0++;
                                        System.out.println("Фермер гонит волка " + countDrAw0 + " раз");
                                        break;
                                    case 1:
                                        countDrAw1++;
                                        System.out.println("Фермер гонит Лиса " + countDrAw1 + " раз");
                                        break;
                                    case 2:
                                        countDrAw2++;
                                        System.out.println("Фермер гонит Медведа " + countDrAw2 + " раз");
                                        break;
                                    case 3:
                                        countDrAw3++;
                                        System.out.println("Фермер гонит Медведа " + countDrAw3 + " раз");
                                        break;
                                    case 4:
                                        countDrAw4++;
                                        System.out.println("Фермер гонит Лиса " + countDrAw4 + " раз");
                                        break;
                                }
                                if (countDrAw0 == 4 && wilds[0].onFarm) {
                                    wilds[randomWild].setOnFarm(false);
                                    System.out.println("Волк обиделся и ушел совсем");
                                }
                                if (countDrAw1 == 4 && wilds[1].onFarm) {
                                    wilds[randomWild].setOnFarm(false);
                                    System.out.println("Лиса обиделся и ушел совсем");
                                }
                                if (countDrAw2 == 4 && wilds[2].onFarm) {
                                    wilds[randomWild].setOnFarm(false);
                                    System.out.println("Медвед обиделся и ушел совсем");}
                                    if (countDrAw3 == 4 && wilds[3].onFarm) {
                                        wilds[randomWild].setOnFarm(false);
                                        System.out.println("Медвед обиделся и ушел совсем");}
                                        if (countDrAw4 == 4 && wilds[4].onFarm) {
                                            wilds[randomWild].setOnFarm(false);
                                            System.out.println("Лис обиделся и ушел совсем");
                                }
                                if (countDrAw0 == 4 && countDrAw1 == 4 && countDrAw2 == 4
                                        && countDrAw3 == 4 && countDrAw4 == 4) {
                                    System.out.println("Фермер молодец");
                                    return;
                                }

                                    for (int i = 0; i <pets.length ; i++) {
                                        if (pets[i].onFarm && pets[i] instanceof CanFeed){
                                            System.out.println("Кормежка "+ pets[i].getName());
                                            farmer.feed(pets);
                                        }

                                    }



                                    countPet = 0;
                                    for (int i = 0; i < pets.length; i++) {
                                        if (pets[i].onFarm) {
                                            if (pets[i] instanceof GiveResources) {
                                                System.out.println("Фермер собирает ресурсы с " + pets[i].getName());
                                                farmer.resources += pets[i].getResources();
                                                countPet++;
                                            }
                                        }
                                    }
                                    for (int i = 0; i < pets.length; i++) {
                                        if (countPet == 0 && pets[i].onFarm && pets[i] instanceof CanEat) {
                                            farmer.resources += pets[i].getHealth();
                                            System.out.println("Фермер съел" + pets[i].getName());
                                            pets[i].setOnFarm(false);



                                        }
                                    }
                                    int countPet1 = 0;
                                    for (int i = 0; i < pets.length; i++) {
                                        if(!pets[i].onFarm ){
                                            countPet1++;
                                            if (countPet1==10){
                                                System.out.println("Зверье закончилось,без кота и жизнь не та,фермер проиграл");
                                                return;
                                            }}}

                            }





                        }

                        else {
                            System.out.println("The Farmer DIED");
                            return;}
                    }
                }
       }

        }
    }

