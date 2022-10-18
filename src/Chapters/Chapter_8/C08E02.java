package Chapters.Chapter_8;

import java.util.Scanner;

public class C08E02 {
    public static void main(String[] args) {
        double [][] matrix = getTheMatrix();

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] matrix) {

        double total = 0;
        for (int i = 0; i < matrix.length; i++) {
            total += matrix[i][i];
        }
        return total;
    }
    public static double[][] getTheMatrix () {
        Scanner input = new Scanner(System.in);
        int rows = 4;
        int column = 4;
        double [][] m = new double[rows][column];
        System.out.println("Enter a 4-by-4 matrix row by row: ");

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < column; col++) {
                m[row][col] = input.nextInt();
                
            }

        }
        return m;
    }

}
