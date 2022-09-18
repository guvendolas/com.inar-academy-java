package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer, the input ends if it is 0: ");
        int number = input.nextInt();
        double total = 0;
        int pos = 0;
        int neg = 0;

        if (number == 0) {
            System.out.println("No numbers entered except 0");
            System.exit(1);
        }

        int count = 0;

        while (number != 0) {

            total += number;
            count++;

            if (number > 0) {
                pos++;
            }
            if (number < 0) {
                neg++;
            }

            number = input.nextInt();
        }

        double average = total / count;

        System.out.println("The number of positives is: " + pos);
        System.out.println("The number of negatives is: " + neg);
        System.out.println("The total is: " + total);
        System.out.println("The average is: " + average);

    }

}
