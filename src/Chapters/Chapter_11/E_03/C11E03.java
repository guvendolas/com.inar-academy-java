package Chapters.Chapter_11.E_03;

public class C11E03 {
    public static void main(String[] args) {
        Account account = new Account(1, 200);
        SavingsAccount savingsAccount = new SavingsAccount(3,300);
        CheckingAccount checkingAccount = new CheckingAccount(4,400);

        System.out.println(account);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);
    }
}
