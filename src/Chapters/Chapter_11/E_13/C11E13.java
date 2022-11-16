package Chapters.Chapter_11.E_13;

import java.util.ArrayList;
import java.util.Scanner;

public class C11E13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter the ten numbers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());



        }
        removeDuplicate(list);
        System.out.println("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }

    }
}
