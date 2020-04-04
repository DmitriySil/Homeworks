package Homework.Fitness;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
//          Что требуется в задаче не особо понял,сделал,как сделал ¯\_(ツ)_/¯
public class FitnessClub {
    protected Membership[] people = new Membership[29];
    protected Membership[] dumbbells = new Membership[15];
    protected Membership[] tracks = new Membership[10];
    protected Membership[] inventory = new Membership[10];
    protected Logger log;

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

    public Membership[] getPeople() {
        return people;
    }

    public void setPeople(Membership[] people) {
        this.people = people;
    }

    public Membership[] getDumbbells() {
        return dumbbells;
    }

    public void setDumbbells(Membership[] dumbbells) {
        this.dumbbells = dumbbells;
    }

    public Membership[] getTracks() {
        return tracks;
    }

    public void setTracks(Membership[] tracks) {
        this.tracks = tracks;
    }

    public Membership[] getInventory() {
        return inventory;
    }

    public void setInventory(Membership[] inventory) {
        this.inventory = inventory;
    }

    public void addPeople(Membership[] newMember){
        for (int i = 0,j = 0; i < people.length; i++,j++) {
            if (people[i] == null){
                people[i] = newMember[j];
                if (j == newMember.length-1){
                    break;
                }

            }
        }
    }

    public void fitnessDay(){

        int a,randomPerson;
        Random random = new Random();
        if (LocalTime.now().isAfter(LocalTime.of(22, 0)) &&
                LocalTime.now().isBefore(LocalTime.of(8, 0))) {
            System.out.println("Зал закрыт");
        }
        System.out.println("\n Вход в зал");
        for (int i = 0,j = 0; i < people.length; i++) {
            randomPerson = random.nextInt(29);
            if (people[randomPerson] != null) {
                if (people[randomPerson].getGym()) {
                    if (people[randomPerson].getEndTime().isAfter(LocalTime.now())) {
                        if (j <= dumbbells.length - 1) {
                            dumbbells[j] = people[randomPerson];
                            System.out.println(dumbbells[j].getSurName()+" Зашел в зал");
                            people[randomPerson] = null;
                            j++;
                        }
                        else {
                            System.out.println("Для вас "+people[randomPerson].getSurName()+" извините,нет места");
                        }
                    }
                    else {
                        System.out.println(people[randomPerson].getSurName()+" извините,не ваше время ");
                    }
                }
                else {
                    System.out.println(people[randomPerson].getSurName()+" извините,у вас нет доступа");
                }
            }
        }
        System.out.println("\n Вход в бассейн");
        for (int i = 0,j = 0; i < people.length; i++) {
            randomPerson = random.nextInt(29);
            if (people[randomPerson] != null) {
                if (people[randomPerson].getPool()) {
                    if (people[randomPerson].getEndTime().isAfter(LocalTime.now())) {
                        if (j <= tracks.length - 1) {
                            tracks[j] = people[randomPerson];
                            System.out.println(tracks[j].getSurName()+" Зашел в бассейн");
                            people[randomPerson] = null;
                            j++;
                        }
                        else {
                            System.out.println("Для вас "+people[randomPerson].getSurName()+" извините,нет места");
                        }
                    }
                    else {
                        System.out.println(people[randomPerson].getSurName()+" извините,не ваше время ");
                    }
                }
                else {
                    System.out.println(people[randomPerson].getSurName()+" извините,у вас нет доступа");
                }
            }
        }






    }
}
