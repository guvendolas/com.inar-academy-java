package Chapters.BitiyorGonlumunEfendisi.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class E7_12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the ten numbers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list.toString());

        for (int i = list.size() - 1; i < 0 ; i--) {
            System.out.println(list.get(i) + " ");
        }
    }
}
