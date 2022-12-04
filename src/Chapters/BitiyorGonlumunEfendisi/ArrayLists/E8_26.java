package Chapters.BitiyorGonlumunEfendisi.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E8_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 9 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();

        double[][] arr = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.add((int) input.nextDouble());
            }
            Collections.sort(list);
            for (int j = 0; j < 3; j++) {
                arr[i][j] = list.get(j);
            }
            list.clear();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
