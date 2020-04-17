package Homework.School2;

public class School {
    private final String schoolName;
    private Director director;
    private Schoolboy[] schoolboys = new Schoolboy[3];
    private Teacher[] teachers = new Teacher[3];




    public School(String schoolName, Director director) {
        this.schoolName = schoolName;
        this.director = director;
    }

    public void dayAtSchool (){
        director.beginLesson();
        for (Teacher t:teachers) {
            if (t != null){
                for (Schoolboy s:schoolboys) {
                    if (s != null){
                        if (t.getSubject().equals(s.getSubject())){
                            t.teach(s);
                            System.out.println(s.getLevel());
                        }
                    }

                }
            }

        }
    director.endLesson();
    }

    public void addPTeacher(Teacher teacher){
        for (int i = 0; i < teachers.length ; i++) {
            if (teachers[i] == null){
                teachers[i] = teacher;
            }

        }
    }
    public void addPupil(Schoolboy schoolboy){
        for (int i = 0; i < schoolboys.length; i++) {
            if (schoolboys[i] == null){
                schoolboys[i] = schoolboy;
            }

        }
    }

}
