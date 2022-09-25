package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loan = input.nextDouble();

        System.out.print("Number of Years: ");
        int years = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualRate = input.nextDouble();

        int month;
        double interest, principal;

        double monthlyRate = annualRate / 1200;
        double monthlyPayment = (loan * monthlyRate) / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
        double totalPayment = monthlyPayment * years * 12;

        System.out.printf("\nMonthly Payment: %1.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %1.2f", totalPayment);

        System.out.println("\n\nPayment#     Interest     Principal     Balance");
        for (month = 1; month <= years * 12; month++) {
            interest = monthlyRate * loan;
            principal = monthlyPayment - interest;
            loan = loan - principal;
            int formatter = 17;
            if (month >= 10)
                formatter--;
            System.out.printf("%-1d%" + (formatter) + ".2f%14.2f%15.2f\n", month, interest, principal, loan);
        }
    }
}
