package Chapters.Chapter_13.E_15;

import java.math.BigInteger;

public class C13E15 {
    public static void main(String[] args) {
        Rational r1 = new Rational(new BigInteger("300000"),
                new BigInteger("500000"));
        Rational r2 = new Rational(new BigInteger("800000"),
                new BigInteger("100000"));

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
