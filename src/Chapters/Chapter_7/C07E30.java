package Chapters.Chapter_7;

import java.util.Scanner;

public class C07E30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int [] values = new int[input.nextInt()];
        System.out.println("Enter a numbers: ");
        for (int i = 0; i < values.length; i++) {
            values [i] = input.nextInt();
        }
        System.out.println("The list has " + (isConsecutiveFor(values) ? "" : " no ") + "consecutive fours");
    }
    public static boolean isConsecutiveFor (int [] values) {
        int count = 1;
        for (int i = 0; i < values.length - 1; i++) {
            if (values [i] == values [i + 1])
                count ++;

            if (count == 4)
                return true;

            if (values [i] != values [i + 1])
                count = 1;
        }
        return false;
    }
}
