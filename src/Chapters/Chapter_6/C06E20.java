package Chapters.Chapter_6;

import java.util.Scanner;

public class C06E20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = input.nextLine();
        System.out.println(countLetters(string));

    }
    public static int countLetters (String s) {
        int numberOfLetters = 0;
        for (int i = 0; i < s.length(); i++ ) {
            if (Character.isLetter(s.charAt(i)))
                numberOfLetters++;
        }
        return numberOfLetters;
    }
}
