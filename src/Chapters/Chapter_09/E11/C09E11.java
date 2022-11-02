package Chapters.Chapter_09.E11;

import java.util.Scanner;

public class C09E11 {
    public static void main(String[] args) {


        Double[] matrix = getUser();
        LinearEquations linearEquations = new LinearEquations(matrix[0],matrix[1], matrix[2], matrix[3], matrix[4], matrix[5]);
        display(linearEquations);
    }

    private static Double[] getUser() {
        Scanner input = new Scanner(System.in);
        Double[] matrix = new Double[6];

        System.out.println("Enter the a, b, c, d, e, f: ");
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = input.nextDouble();
        }
        return matrix;
    }

    public static void display(LinearEquations linearEquations){
        if (linearEquations.isSolvable()) {


            System.out.println("x is " + linearEquations.getX());
            System.out.println("y is " + linearEquations.getY());


        } else {
            System.out.println("The equation has no solution");
        }
    }
}
