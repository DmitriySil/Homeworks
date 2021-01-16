package Homework.multithreading;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1,50_000);
        Account account2 = new Account(2,50_000);

        Bank bank = new Bank();
        bank.transferMoney(account1,account2,3000);
        bank.transferMoney(account2,account1,1500);
        bank.transferMoney(account2,account1,15000);

    }
}
