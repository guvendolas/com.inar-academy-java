package Chapters.Chapter_10.E_16;

import java.math.BigInteger;

public class C10E16 {
    public static void main(String[] args) {
        int count = 0;
        BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger zero = new BigInteger("0");

        while (count < 10) {
            if (zero.compareTo(number.remainder(new BigInteger("2"))) == 0 ||
                    zero.compareTo(number.remainder(new BigInteger("3"))) == 0) {
                System.out.println(number);
                count++;
            }
            number = number.add(new BigInteger("1"));
        }
    }
}
