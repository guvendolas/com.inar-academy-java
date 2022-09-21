package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number one: ");
        int n1 = input.nextInt();
        System.out.print("Enter the number two: ");
        int n2 = input.nextInt();
        int gcd = 1;
        int k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        System.out.println("Greatest Common Divisor is: " + gcd);
    }

}

