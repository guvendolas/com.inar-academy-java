package Chapters.Chapter_09.E10;

import java.util.Scanner;

public class C09E10 {
    public static void main(String[] args) {
        double [] matrix = getUser();
        QuadraticEquations quadraticEquation = new QuadraticEquations(matrix[0],matrix[1],matrix[2]);
        display(quadraticEquation);


    }
    public static void display(QuadraticEquations quadraticEquation) {
        System.out.print("The equation has ");
        if (quadraticEquation.getDiscriminant() < 0)
            System.out.println("no real roots");
        else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("two roots " + quadraticEquation.getRoot1() +
                    " and " + quadraticEquation.getRoot2());
        }
        else {
            System.out.println("one root " + (quadraticEquation.getRoot1() > 0 ?
                    quadraticEquation.getRoot1() : quadraticEquation.getRoot2()));
        }

    }
    public static double[] getUser () {
        Scanner input = new Scanner(System.in);
        double[] matrix = new double[3];

        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = input.nextDouble();
        }
        return matrix;

    }
}

