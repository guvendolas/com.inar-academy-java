package Chapters.Chapter_11.E_04;

import java.util.ArrayList;
import java.util.Scanner;

public class C11E04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter numbers ending 0 ");
        Integer number = input.nextInt();
        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();
        }
        System.out.println("Max is: " + max(list));
    }
    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
