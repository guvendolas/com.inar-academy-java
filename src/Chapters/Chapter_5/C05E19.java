package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E19 {
    public static void main(String[] args) {
        int startRight = 0,
                endSpace = 7;
        for (int row = 1; row <= 128; row += row) {
            for (int startSpace = 0; startSpace < endSpace; startSpace++) {
                System.out.print("    ");
            }
            for (int l = 1; l <= row; l += l) {
                System.out.printf("%4d", (l));
            }
            for (int r = startRight; r > 0; r /= 2) {
                System.out.printf("%4d", (r));
            }
            System.out.println();
            endSpace--;
            startRight = row;
        }
    }
}
