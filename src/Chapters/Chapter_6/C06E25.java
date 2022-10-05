package Chapters.Chapter_6;

import java.util.Scanner;

public class C06E25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the milliseconds: ");
        int n = input.nextInt();

        System.out.println(convertMillis(n));
    }

    public static String convertMillis(long millis) {
        long seconds = millis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        return hours + ":" + (minutes % 60) + ":" + (seconds % 60);
    }
}
