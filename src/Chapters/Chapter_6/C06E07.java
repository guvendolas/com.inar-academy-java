package Chapters.Chapter_6;

import java.util.Scanner;

public class C06E07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfYears = 30;

        System.out.print("\nThe amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Years     Future Value");
        for (int years = 1; years <= numberOfYears; years++) {
            System.out.printf("%-10d", years);
            System.out.printf("%11.2f\n",
                    futureInvestmentValue(amount, monthlyInterestRate, years));
        }
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}

