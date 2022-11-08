package Chapters.Chapter_10.E_17;

import java.math.BigInteger;

public class C10E17 {
    public static void main(String[] args) {
        BigInteger i = new BigInteger(Long.MAX_VALUE + "");
        BigInteger end = i.add(new BigInteger("10"));

        for (i = new BigInteger(Long.MAX_VALUE + "");
             i.compareTo(end) <= 0;
             i = i.add(new BigInteger("1")));
             System.out.println(i.multiply(i));
    }
}
