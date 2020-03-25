package Homework.Farm;

public class Farmer {
    protected int resources = 5;


    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public void collectRes(){

    }
    public void eatPet(){

    }
    public void driveAway(){

    }

    public void feed(){

    }

    public void eat(){
        resources-=2;
    }
}
