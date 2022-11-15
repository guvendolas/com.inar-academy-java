package Chapters.Chapter_11.E_11;

import java.util.ArrayList;
import java.util.Scanner;

public class C11E11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        System.out.println("before : " + list);
        sort(list);
        System.out.println("Display numbers: ");
        System.out.println(list);

    }
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = list.get(i);
            int index = i;

            for (int j = 0; j < list.size(); j++) {
                if (min > list.get(j)) {
                    min = list.get(j);
                    index = j;
                }
            }
            if (index != i) {
                list.set(index,list.get(i));
                list.set(i,min);
            }
        }
    }
}
