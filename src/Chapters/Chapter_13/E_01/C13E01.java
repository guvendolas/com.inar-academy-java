package Chapters.Chapter_13.E_01;

import java.util.Scanner;

public class C13E01 {
    public static void main(String[] args) throws Exception{
        double side1;
        double side2;
        double side3;
        String color = "";
        boolean isFilled;

        try(Scanner input = new Scanner(System.in);) {
            System.out.println("Enter 3 side for triangle: ");
            side1 = input.nextDouble();
            side2 = input.nextDouble();
            side3 = input.nextDouble();

            System.out.println("Enter color and triangle is filled: ");
            color = input.next();
            isFilled = input.nextBoolean();
        }
        Triangle triangle = new Triangle(side1,side2,side3);

        triangle.setFilled(isFilled);
        triangle.setColor(color);

        System.out.println("Area of triangle is " + triangle.getArea() +
                "\nPerimeter is " + triangle.getPerimeter() +
                "\nColor is " + triangle.getColor() + "\nFilled: " + triangle.isFilled());
    }
}
