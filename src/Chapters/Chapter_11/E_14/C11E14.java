package Chapters.Chapter_11.E_14;

import java.util.ArrayList;
import java.util.Scanner;

public class C11E14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        System.out.println("Enter 5 integers list 1: ");
        fill(list1);
        System.out.println("Enter 5 integers list 2: ");
        fill(list2);
        ArrayList<Integer> list3 = union(list1,list2);

        System.out.println("The conbined list is ");
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }

    }
    public static void fill(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = list1;
        for (int i = 0; i < list2.size(); i++) {
            list3.add(list2.get(i));
        }
        return list3;
    }
}
