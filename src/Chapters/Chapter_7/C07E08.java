package Chapters.Chapter_7;

import java.util.Scanner;

public class C07E08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] values = new double[10];

        System.out.println("Enter the ten numbers: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        System.out.println("Average value is " + average(values));

    }
    public static int average (int [] arrays) {
        int average = 0;
        for (int i : arrays)
        average += i;
        return average / arrays.length;
    }
    public static double average (double [] arrays) {
        double average = 0;
        for (double i : arrays)
            average += i;
        return average / arrays.length;
    }
}
