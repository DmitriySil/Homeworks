package Homework.Climbers;

public class Main {
    public static void main(String[] args) {
        Mount mount1 = new Mount("Rocky Mountains","USA",4399);
        Mount mount2 = new Mount("Everest","China",8848);
        Mount mount3 = new Mount("Elbrus","Russia",5642);
        Mount mount4 = new Mount("Alpes","Italy",4810);

       Climber climber1 = new Climber("Gabe","Walker","wall str");
       Climber climber2 = new Climber("Hal","Tucker","Green str");
       Climber climber3 = new Climber("Jessie","Deighan","yellow str");
       Climber climber4 = new Climber("Qualen","Unknow","Black str");
       Climber climber5 = new Climber("Sarah","Unknow","Orange str");
       Climber climber6 = new Climber("Richard","Travers","Brown str");
       Climber climber7 = new Climber("Ivan","Petrov","Lenina str");
       Climber climber8 = new Climber("Petr","Ivanov","Stalina str");
       Climber climber9 = new Climber("Masha","Balabasha","Ivanova str");
        GroupOfClimbers groupOfClimbers1 = new GroupOfClimbers(mount3);
        GroupOfClimbers groupOfClimbers2 = new GroupOfClimbers(mount2);
        GroupOfClimbers groupOfClimbers3 = new GroupOfClimbers(mount1);

        groupOfClimbers3.addClimbers3(climber1);
        groupOfClimbers3.addClimbers3(climber2);
        groupOfClimbers3.addClimbers3(climber3);

        groupOfClimbers1.addClimbers2(climber4);
        groupOfClimbers1.addClimbers2(climber5);

        groupOfClimbers2.addClimbers2(climber6);
        groupOfClimbers2.addClimbers2(climber7);


    }
}
