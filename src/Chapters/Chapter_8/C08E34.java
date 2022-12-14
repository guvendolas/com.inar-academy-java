package Chapters.Chapter_8;

import java.util.Scanner;

public class C08E34 {
    public static void main(String[] args) {
        double[][] points = new double[6][2];

        getPoints(points);

        double[] result = getTheRightmostLowestPoint(points);

        System.out.println("the rigthmost lowest points is: " + "( " + result[0] + " , " + result[1] + " )");

    }

    public static void getPoints(double[][] points) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter points for rigthmost lowest points: ");
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 2; col++) {
                points[row][col] = input.nextDouble();
            }
        }
    }

    public static double[] getTheRightmostLowestPoint(double[][] points) {


        double a = points[0][0];
        double b = points[0][1];

        for (int p = 1; p < points.length; p++) {
            if (b > points[p][1]) {
                a = points[p][0];
                b = points[p][1];
            } else if (b == points[p][1] && points[p][0] > a) {
                a = points[p][0];
                b = points[p][1];
            }
        }

        double[] result = {a, b};
        return result;

    }
}
