package Chapters.Chapter_12.Chapter_12_Listing;

import java.util.Scanner;

public class Listing_12_4_QuotientWithException {
    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1,number2);
            System.out.println(number1 + " / " + number2 + " is " + result);
        }
        catch (ArithmeticException ex) {
            System.out.println("Exception: an integer " + "cannot be divided zero ");
        }
        System.out.println("Execution continues ...");
    }
}
