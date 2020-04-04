package Homework.Fitness;

public class Zone {
    protected Membership[] people = new Membership[29];

    public Membership[] getPeople() {
        return people;
    }

    public void setPeople(Membership[] people) {
        this.people = people;
    }

    public void addPeople(Membership[] newMember){
        for (int i = 0,j = 0; i < people.length; i++,j++) {
            if (people[i] == null){
                people[i] = newMember[j];
                if (j == newMember.length-1){
                    break;
                }

            }
        }
    }
}
