package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = input.nextInt();
        for (int i = 2; num / i != 1; ) {

            if (num % i == 0) {
                System.out.print(i + ",");
                num = num / i;
            } else {
                i++;
            }
        }
        System.out.print(num);
    }
}
