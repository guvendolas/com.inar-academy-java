package Chapters.Chapter_7;

import java.util.Scanner;

public class C07E28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] num = new int[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < num.length; i++) {
            num [i] = input.nextInt();
        }
        getCombinations(num);

    }
    public static void getCombinations (int [] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i != j) {
                    System.out.println("[" + num [i] + " , " + num[j] + "]");
                }
            }
        }
    }
}

