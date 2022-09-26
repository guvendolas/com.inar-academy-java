package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E32 {
    public static void main(String[] args) {
        int lotteryDigit1;
        int lotteryDigit2;
        lotteryDigit1 = (int)(Math.random() * 10);

        do {
            lotteryDigit2 = (int)(Math.random() * 10);
        } while (lotteryDigit1 == lotteryDigit2);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two distinct digits): ");
        int guess = input.nextInt();

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println(
                "The lottery number is " + lotteryDigit1 + lotteryDigit2);

        if (guessDigit1 == lotteryDigit1 &&
                guessDigit2 == lotteryDigit2)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, you lose :(");
    }
    }

