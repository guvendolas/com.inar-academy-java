package Chapters.Chapter_12.Chapter_12_Listing;

import java.util.Scanner;

public class Listing_12_1_Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
    }
}
