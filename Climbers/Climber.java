package Homework.Climbers;

public class Climber {
    protected String name;
    protected String surName;
    protected String address;

    public Climber(String name, String surName, String address) {
        this.name = name;
        this.surName = surName;
        this.address = address;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        if (name!=null && name.length()>=3){
            this.name = name;}
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address!=null && address.length()>=5){
        this.address = address;}
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        if (name!=null && name.length()>=3){
        this.surName = surName;}
    }
}
