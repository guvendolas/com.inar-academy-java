package Chapters.Chapter_6;

import java.util.Scanner;

public class C06E37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int number = input.nextInt();
        System.out.println("Enter the width expressed in integer format: ");
        int width = input.nextInt();
        System.out.println("The formatted number is: " + format(number, width));

    }

    public static String format(int number, int width) {
        String s = (number + "");
        if (s.length() < width) {
            for (int i = width - s.length(); i > 0; i--) {
                s = 0 + s;
            }
        }

        return s;
    }
}
