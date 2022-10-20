package Chapters.Chapter_8;

import java.util.Scanner;

public class C08E25 {
    public static void main(String[] args) {
        double[][] matrix = new double[3][3];
        fillTheArray(matrix);
        printArray(matrix);


        System.out.println("It is " + (isMarkovMatrix(matrix) ? " " : " not ") + "a Markov Matrix");
    }

    public static boolean isMarkovMatrix(double[][] m) {
        return isElementsPositive(m) && isEachColumnSum1(m);
    }

    public static boolean isElementsPositive(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0)
                    return false;
            }
        }
        return true;
    }


    public static boolean isEachColumnSum1(double[][] m) {
        for (int col = 0; col < m.length; col++) {
            double sum = 0;
            for (int row = 0; row < m.length; row++) {
                sum += m[row][col];
            }
            if (sum != 1)
                return false;
        }
        return true;

    }

    public static void printArray(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillTheArray(double[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
    }
}
