package Homework.School;

import java.util.Arrays;

public class School {
    private final String schoolName = "School 552";
    protected Director director;
    protected Teacher[] teachers = new Teacher[3];
    protected Pupil[] pupils = new Pupil[6];


    public School(Director director) {
        this.director = director;
    }

    public void addPup (Pupil newPup){
        for (int i = 0; i < pupils.length; i++) {
            if (pupils[i] == null){
                pupils[i] = newPup;
                break;
            }

        }
    }

    public void addTech (Teacher newTech){
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null){
                teachers[i] = newTech;
                break;
            }

        }
    }



    public void dayAtSchool (){
        System.out.println(schoolName);
        director.start();

        for (Teacher teach:teachers) {
            if (teach != null){
                for (Pupil pup:pupils) {
                    if (pup != null){
                        if (pup.getLearnLesson().equals(teach.getTeachLesson())){
                            pup.study();
                            System.out.println(pup.getName() + "-" + pup.getLevel());
                        }
                    }

                }
            }

        }
        director.end();


    }

}
