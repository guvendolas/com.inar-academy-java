package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String s2 = "";

        for (int i = 0; i < s.length(); i += 2) {
            s2 += s.charAt(i);
        }
        System.out.println(s2);
    }
}
