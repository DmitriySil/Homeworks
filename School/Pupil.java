package Homework.School;

public class Pupil extends Subject implements ToStudy {
protected String learnLesson;
protected int level;

    public Pupil(String name, int age, String learnLesson, int level) {
        super(name, age);
        setLearnLesson(learnLesson);
        setLevel(level);
    }

    public String getLearnLesson() {
        return learnLesson;
    }

    public void setLearnLesson(String learnLesson) {
        this.learnLesson = learnLesson;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }



    @Override
    public void study() {
        level++;

    }
}
