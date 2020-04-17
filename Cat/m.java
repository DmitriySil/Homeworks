package Homework.Cat;

public class m {
    public static void main(String[] args) {
        cat cat1 = new cat(120,"fff",5);
        cat cat2 = new cat(150,"tty",7);
        cat1.setName("gg");
        cat2.setName("ggh");
        cat1.fightCat(cat2);
        cat2.fightCat(cat1);
        System.out.println(cat1.getHp());
        System.out.println(cat2.getHp());
        while (cat1.getHp()> 0 && cat2.getHp()>0){
            cat1.fightCat(cat1);
            cat2.fightCat(cat2);
        }
        if(cat1.getHp()>0){
            System.out.println(cat1.getName());

        }
        else if(cat2.getHp()>0){
            System.out.println(cat2.getName());
        }
    }
}
