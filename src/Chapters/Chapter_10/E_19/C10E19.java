package Chapters.Chapter_10.E_19;

import java.math.BigInteger;

import static Chapters.Chapter_10.E_18.C10E18.isPrime;

public class C10E19 {
    public static void main(String[] args) {
        displayFirst100MersennePrime();
    }

    public static void displayFirst100MersennePrime() {
        System.out.printf("%-10s | %-10s\n", "p", "2^p - 1");

        int count = 0;
        BigInteger number = new BigInteger("2");

        while (count < 100) {
            if (isMersennePrime(number)) {
                System.out.printf("%-10d | %-10d\n", number, get2PowNumber(number).subtract(BigInteger.ONE));
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

    public static boolean isMersennePrime(BigInteger number) {
        return isPrime(number) && isPrime(get2PowNumber(number).subtract(BigInteger.ONE));
    }

    public static BigInteger get2PowNumber(BigInteger number) {
        BigInteger result = new BigInteger("2");
        BigInteger start = new BigInteger("1");

        while (start.compareTo(number) != 0) {
            result = result.multiply(new BigInteger("2"));
            start = start.add(BigInteger.ONE);
        }
        return result;
    }
}

