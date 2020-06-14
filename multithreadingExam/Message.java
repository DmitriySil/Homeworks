package Homework.multithreadingExam;

import java.io.Serializable;
import java.time.LocalTime;


public class Message implements Serializable {
    private String text;
    private LocalTime time;


    public Message(String text) {
        this.text = text;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime() {

        this.time = LocalTime.now();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return  text +
                ":" + time;
    }
}
