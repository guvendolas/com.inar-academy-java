package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        String s2 = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += s.charAt(i);
        }
        System.out.println("The reverse string is " + s2);
    }
}
