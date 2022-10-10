package Chapters.Chapter_7;

import java.util.Scanner;

public class C07E02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten space-separated integers: ");

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        displayReverse(arr);
        input.close();
    }

    public static void displayReverse(int[] arrRev) {
        for (int i = arrRev.length - 1; i >= 0; i--) {
            System.out.print(arrRev[i] + " ");

        }
    }

}

