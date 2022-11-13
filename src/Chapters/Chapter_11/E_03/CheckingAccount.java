package Chapters.Chapter_11.E_03;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount() {
        super(0, 0);
        overdraftLimit = -20;
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
        }else {
            System.out.println("Warning!");
        }
    }

    public String toString() {
        return String.format("%.2f", overdraftLimit);
    }
}
