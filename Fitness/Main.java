package Homework.Fitness;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Membership member1 = new SingleTime(LocalDate.now(),LocalDate.now(),"Ivan","Petrov",1990);
        Membership member2 = new SingleTime(LocalDate.now(),LocalDate.now(),"Ivan","Petrov",1990);
        Membership member3 = new SingleTime(LocalDate.now(),LocalDate.now(),"Ivan","Petrov",1990);
        Membership member4 = new SingleTime(LocalDate.now(),LocalDate.now(),"Ivan","Petrov",1990);
        Membership member5 = new SingleTime(LocalDate.now(),LocalDate.now(),"Ivan","Petrov",1990);
        Membership member6 = new SingleTime(LocalDate.now(),LocalDate.now(),"Ivan","Petrov",1990);
        Membership member7 = new SingleTime(LocalDate.now(),LocalDate.now(),"Ivan","Petrov",1990);
        Membership member8 = new SingleTime(LocalDate.now(),LocalDate.now(),"Ivan","Petrov",1990);
        Membership member9 = new SingleTime(LocalDate.now(),LocalDate.now(),"Ivan","Petrov",1990);
        Membership member10 = new SingleTime(LocalDate.now(),LocalDate.now(),"Ivan","Petrov",1990);

        Membership member11 = new Daytime(LocalDate.now(),LocalDate.now(),"Ivan","Ivanov",1990);
        Membership member12 = new Daytime(LocalDate.now(),LocalDate.now(),"Ivan","Ivanov",1990);
        Membership member13 = new Daytime(LocalDate.now(),LocalDate.now(),"Ivan","Ivanov",1990);
        Membership member14 = new Daytime(LocalDate.now(),LocalDate.now(),"Ivan","Ivanov",1990);
        Membership member15 = new Daytime(LocalDate.now(),LocalDate.now(),"Ivan","Ivanov",1990);
        Membership member16 = new Daytime(LocalDate.now(),LocalDate.now(),"Ivan","Ivanov",1990);
        Membership member17 = new Daytime(LocalDate.now(),LocalDate.now(),"Ivan","Ivanov",1990);
        Membership member18 = new Daytime(LocalDate.now(),LocalDate.now(),"Ivan","Ivanov",1990);
        Membership member19 = new Daytime(LocalDate.now(),LocalDate.now(),"Ivan","Ivanov",1990);
        Membership member20 = new Daytime(LocalDate.now(),LocalDate.now(),"Ivan","Ivanov",1990);

        Membership member21 = new Unlimited(LocalDate.now(),LocalDate.now(),"Ivan","Ivanof",1999);
        Membership member22 = new Unlimited(LocalDate.now(),LocalDate.now(),"Ivan","Ivanof",1999);
        Membership member23 = new Unlimited(LocalDate.now(),LocalDate.now(),"Ivan","Ivanof",1999);
        Membership member24 = new Unlimited(LocalDate.now(),LocalDate.now(),"Ivan","Ivanof",1999);
        Membership member25 = new Unlimited(LocalDate.now(),LocalDate.now(),"Ivan","Ivanof",1999);
        Membership member26 = new Unlimited(LocalDate.now(),LocalDate.now(),"Ivan","Ivanof",1999);
        Membership member27 = new Unlimited(LocalDate.now(),LocalDate.now(),"Ivan","Ivanof",1999);
        Membership member28 = new Unlimited(LocalDate.now(),LocalDate.now(),"Ivan","Ivanof",1999);
        Membership member29 = new Unlimited(LocalDate.now(),LocalDate.now(),"Ivan","Ivanof",1999);
        Membership member30 = new Unlimited(LocalDate.now(),LocalDate.now(),"Ivan","Ivanof",1999);
        Membership[] memberships = {member1,member2,member3,member4,member5,member6,member7,member8,member9,member10,
                member11,member12,member13,member14,member15,member16,member17,member18,member19,member20,member21,
                member22,member23,member24,member25,member26,member27,member28,member29,member30};


        FitnessClub fitnessClub = new FitnessClub();
        fitnessClub.addPeople(memberships);

        fitnessClub.fitnessDay();
        System.out.println("Что требуется в задаче не особо понял,сделал,как сделал ¯\\_(ツ)_/¯");






    }
}
