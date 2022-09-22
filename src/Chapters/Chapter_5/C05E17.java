package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = num - 1 - i; j > 0; j--) {
                System.out.print("   ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.printf("%3d", j);
            }
            for (int j = 2; j < i + 2; j++) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }


    }


}

