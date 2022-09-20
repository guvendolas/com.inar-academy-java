package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student");
        int n = input.nextInt();
        int max = 0;
        int secondMax = 0;
        String maxName = "";
        String secondMaxName = "";

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the name and score of student (" + i + "):");
            String name = input.next();
            int score = input.nextInt();
            if (score > max) {
                secondMax = max;
                secondMaxName = maxName;
                max = score;
                maxName = name;
            } else if (score > secondMax) {
                secondMax = score;
                secondMaxName = name;
            }
        }
        System.out.println("The Student with the highest score is " + maxName);
        System.out.println("The highest score is " + max);
        System.out.println("The Student with the second highest score is " + secondMaxName);
        System.out.println("The second highest score is " + secondMax);
    }
}
