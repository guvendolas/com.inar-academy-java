package Chapters.Chapter_8;

import java.util.Scanner;

public class C08E01 {
    public static void main(String[] args) {

        double [][] print = getPrint();

        for (int i = 0; i < print[0].length; i++) {
            System.out.println("sum of elements at column " + i + " is " + sumColumn(print,i));
        }

    }

    private static double[][] getPrint() {
        Scanner input = new Scanner(System.in);
        double [][] m = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }
    public static double sumColumn (double [][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
