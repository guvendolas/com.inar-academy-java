package Weeks.Week_7;

import java.util.Scanner;

/**
 * tarik -> true
 * Inar Academy -> false
 */

public class isUniqueCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = input.nextLine();
        if (isUnique(s)) {
            System.out.println(s + " i a unique string.");
        } else {
            System.out.println(s + " is not unique string.");
        }

    }
    public static boolean isUnique(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
