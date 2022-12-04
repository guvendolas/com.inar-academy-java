package Chapters.BitiyorGonlumunEfendisi.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class E7_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores (0 ends ) ");

        int total = 0;
        int score = 0;

        if (score >= 0) {
            score = input.nextInt();
            list.add(score);
            total = total + score;

        }
        double average = total / list.size();

        int under = 0;
        int over = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < average) {
                under++;
            }else {
                over++;
            }
            System.out.println("average: " + average + "\nSum: " + total + "\nUnder average: " + under +
                    "\nOver Average: " + over);
        }
    }
}
