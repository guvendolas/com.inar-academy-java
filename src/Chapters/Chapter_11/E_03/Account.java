package Chapters.Chapter_11.E_03;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreate;
    public Account (){
        super();
    }

    public Account(int id, double balance) {
        this(0, 0, 0, new Date());
    }


    public Account(int id, double balance, double annualInterestRate, Date dateCreate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreate = new Date();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public double getMonthlyInterestRate () {
        return annualInterestRate / 12;
    }
    public double getMonthlyInterest() {
        return getBalance() * (getAnnualInterestRate() / 100);

    }
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }
    @Override
    public String toString() {
        return "Account, Balance: " + getBalance() + "\n Monthly Interest: " + getMonthlyInterest() +
                "\nCreate Date: " + dateCreate;
    }
}
