package Chapters.Chapter_7;

import java.util.Scanner;

public class C07E10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double[] number = new double[10];
        for (int i = 1; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        System.out.println("The minimum intex number is " + indexOfSmallestElement(number));

    }

    public static int indexOfSmallestElement(double[] array) {
        double minimum = array[0];
        int minimumİndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (minimum > array[i]) {
                minimumİndex = i;
            }

        }
        return minimumİndex;
    }

}
