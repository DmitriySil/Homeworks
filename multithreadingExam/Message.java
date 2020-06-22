package Homework.multithreadingExam;

import java.io.Serializable;
import java.time.LocalTime;


public class Message implements Serializable {
    private String text;
    private LocalTime time;
    private String name;
    private int count;


    public Message(String text,String name) {
        this.text = text;
        this.name = name;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime() {

        this.time = LocalTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return  "from: "+name+" - "+text +
                ":" + time;
    }
}
