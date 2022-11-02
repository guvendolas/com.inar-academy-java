package Chapters.Chapter_09.E13;

import java.util.Scanner;

public class C09E13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < 5) {

            System.out.println("Enter Row --> ");
            int row = input.nextInt();
            System.out.println("Enter Column --> ");
            int column = input.nextInt();

            double[][] matrix = createMatrix(row, column, input);
            display(matrix);

            Location location1 = locateLargest(matrix);

            System.out.println(location1.toString());
            count++;
        }

        Location location = new Location();
        System.out.println(location.toString());

        Location location2 = new Location(2, 3, 155.527);
        System.out.println(location2.toString());


    }

    public static double[][] createMatrix(int row, int column, Scanner input) {
        double[][] result = new double[row][column];
        System.out.println("Enter Values --> ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = Math.random() * 15;
            }
        }
        return result;
    }

    public static Location locateLargest(double[][] a) {
        int row = -1;
        int column = -1;
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (maxValue < a[i][j]) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }

        Location location = new Location(row, column, maxValue);
        return location;
    }

    public static void display(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%-4.2f ", a[i][j]);
            }
            System.out.println();
        }
    }
}
