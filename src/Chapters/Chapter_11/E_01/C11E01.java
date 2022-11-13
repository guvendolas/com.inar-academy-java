package Chapters.Chapter_11.E_01;

import java.util.Scanner;

public class C11E01 {
    public static void main(String[] args) {
      Triangle triangle = getFromUser();
        System.out.println("Triangle area is: " + triangle.getArea() + "\nPerimeter is: " + triangle.getPerimeter() +
                "\nColor is: " + triangle.getColor() + "\nİs filled: " + triangle.isFilled());
    }
    public static Triangle getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three side triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.println("What color is Triangle? ");
        String tColor = input.next();

        System.out.println("is filled?(true/false) ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(s1,s2,s3);
        triangle.setColor(tColor);
        triangle.setFilled(filled);

        return triangle;


    }
}
