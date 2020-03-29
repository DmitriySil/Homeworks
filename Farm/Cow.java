package Homework.Farm;
 public class Cow extends Pet implements GiveResources,CanFeed {

     public Cow(String name, int weight, int speed, int health, int resources, boolean onFarm) {
         super(name, weight, speed, health, resources, onFarm);
     }

     public void givRes (){
        getResources();


    }

     @Override
     public void feed() {
         if (health<120){
             health++;
         }
     }
 }


