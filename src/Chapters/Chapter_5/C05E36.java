package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E36 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int d10 = 0;
        int isbn = input.nextInt();

        for (int i = 1; i <= 9; i++) {
            d10 += i * (isbn % ((int) (Math.pow(10, (10 - i))))) / ((int) Math.pow(10, (9 - i)));
        }
        d10 = d10 % 11;
        System.out.print("The ISBN-10 number is " + isbn);
        if (d10 == 10) {
            System.out.print('X');
        } else {
            System.out.println(d10);
        }
    }
}
