package Homework.Climbers;

public class GroupOfClimbers {
    protected boolean recruitTheGroup = true;
    protected Climber[] climbers = new Climber[3];
    protected Mount mount;

    public GroupOfClimbers( Mount mount) {

        this.mount = mount;
    }

    public boolean isRecruitTheGroup() {
        return recruitTheGroup;
    }

    public void setRecruitTheGroup(boolean recruitTheGroup) {
        this.recruitTheGroup = recruitTheGroup;
    }

    public Climber[] getClimbers() {
        return climbers;
    }

    public void setClimbers(Climber[] climbers) {
        this.climbers = climbers;
    }

    public Mount getMount() {
        return mount;
    }

    public void setMount(Mount mount) {
        this.mount = mount;
    }

    public void addClimbers3(Climber newClimber){
        for (int i = 0; i < climbers.length; i++) {
            if (climbers[i]==(null)){
                climbers[i]=newClimber;
                System.out.println(newClimber.getName()+" в группе "+mount.getName());
                if (i ==2){
                System.out.println("В группе "+mount.getName()+" набор закрыт ");
                    System.out.println();}
                break;
            }

        }

    }
    public void addClimbers2(Climber newClimber){
        for (int i = 0; i < climbers.length; i++) {
            if (climbers[i]==null) {
                if (recruitTheGroup) {
                    climbers[i] = newClimber;
                    if (i>=1) {
                        setRecruitTheGroup(false);
                    }
                    System.out.println(newClimber.getName() + " в группе "+mount.getName());
                    if (i==1){System.out.println();}
                    break;
                }
                else {
                    System.out.println(newClimber.getName()+" ушел "+"В группе "+mount.getName()+" Набор закрыт ");

                }
            }
        }

    }
}
