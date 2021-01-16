package Homework.multithreading;

public class Transaction implements Runnable{

    private Account src; // с какого аккаунта осуществлять перевод
    private Account dst; // на какой аккаунт осуществлять перевод
    private int money; // сколько переводить

    public Transaction(Account src, Account dst, int money) {
        this.src = src;
        this.dst = dst;
        this.money = money;
    }


    @Override
    public void run() {
        // TODO: перевод средств в количестве (money) с аккаунта (src)
        //  на аккаунт (dst)

        synchronized (src){
            synchronized (dst) {
                // перевод денег
                int trans1;
                trans1 = src.getBalance()-money;
                src.setBalance(trans1);
                dst.setBalance(dst.getBalance()+money);
                System.out.println(src.getBalance()+" Account1");
                System.out.println(dst.getBalance()+" Account2");

            }
        }

    }

}