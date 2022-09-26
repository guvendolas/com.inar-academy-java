package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount (e.g., 100): ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months (e.g., 6): ");
        int months = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;

        double compoundValue = 0;
        for (int m = 1; m <= months; m++) {
            compoundValue = (amount + compoundValue) * (1 + monthlyInterestRate);
        }

        System.out.printf(
                "Amount in savings account after " + months + " months: $%.2f\n", compoundValue);
    }
}

