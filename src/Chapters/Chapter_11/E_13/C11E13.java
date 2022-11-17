package Chapters.Chapter_11.E_13;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.Scanner;

public class C11E13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getFromUser(10);

        removeDuplicate(list);
        displayList(list);

    }
    public static void displayList(ArrayList<Integer> list) {
        System.out.println("The distinct numbers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> removed = new ArrayList<>();

        while (!list.isEmpty()){
            int n = list.remove(0);
            if (!removed.contains(n)){
                removed.add(n);
            }
        }
        list.addAll(removed);
    }
    public static ArrayList<Integer> getFromUser(int numberOfIntegers) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfIntegers; i++) {
            list.add(input.nextInt());
        }
        return list;
    }
}
