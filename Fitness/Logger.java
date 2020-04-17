package Homework.Fitness;

import java.util.Arrays;

public class Logger {
    public static void loged(Membership[] member){
        for (int i = 0; i < member.length; i++) {
            if (member[i] != null) {
                System.out.println((member[i].getSurName()));
            }
            else {
                System.out.println("laja");
            }

        }

    }
}
