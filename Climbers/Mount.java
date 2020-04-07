package Homework.Climbers;

public class Mount {
    protected String name;
    protected String country;
    protected int height;

    public Mount(String name, String country, int height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null && name.length()>=4){
        this.name = name;}
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country!=null && country.length()>=4){
        this.country = country;}
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height>=100){
        this.height = height;}
    }


}
