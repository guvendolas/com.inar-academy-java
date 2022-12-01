package Chapters.Chapter_13.E_19;

import java.math.BigInteger;
import java.util.Scanner;

public class C13E19 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try (Scanner input = new Scanner(System.in);) {


            System.out.print("Enter a decimal number: ");
            String[] decimal = input.nextLine().split("[.]");

            Rational r1 = new Rational(new BigInteger(decimal[0]), BigInteger.ONE);

            Rational r2 = new Rational(new BigInteger(decimal[1]), new BigInteger(
                    String.valueOf((int) Math.pow(10, decimal[1].length()))));

            System.out.println("The fraction number is " +
                    (decimal[0].charAt(0) == '-' ? (r1).subtract(r2) : (r1).add(r2)));
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("fazla girdin hemşerim");
            System.out.println(ex.getMessage());
        }
    }
}
