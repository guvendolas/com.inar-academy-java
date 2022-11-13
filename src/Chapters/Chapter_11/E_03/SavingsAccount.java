package Chapters.Chapter_11.E_03;

public class SavingsAccount extends Account{
    public SavingsAccount() {
        super(0,0);
    }

    public SavingsAccount(int id, double balance) {
        super(id,balance);
    }
    @Override
    public void withdraw(double amount) {
       if (getBalance() - amount >= 0) {
           setBalance(getBalance() - amount);
       }else {
           System.out.println("Warning!");
       }
    }
}
