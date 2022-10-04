package Chapters.Chapter_6;

import java.util.Scanner;

public class C06E17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        matrix(n);
    }
    public static void matrix(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}
