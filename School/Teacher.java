package Homework.School;

public class Teacher extends Subject implements ToTeach{
   protected String teachLesson;


    public Teacher(String name, int age, String teachLesson) {
        super(name, age);
       setTeachLesson(teachLesson);

    }

    public String getTeachLesson() {
        return teachLesson;
    }

    public void setTeachLesson(String teachLesson) {
        this.teachLesson = teachLesson;
    }


    @Override
    public void teach(ToStudy pup) {
        pup.study();

    }
}



