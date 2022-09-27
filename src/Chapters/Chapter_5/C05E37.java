package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimial interger: ");
        int decimal = input.nextInt();

        String binary = "";
        for (int i = decimal; i > 0; i /= 2) {
            binary = (i % 2) + binary;
        }
        System.out.println(
                "The binary value of the decimial \"" + decimal + "\" is: " + binary);

    }
}
