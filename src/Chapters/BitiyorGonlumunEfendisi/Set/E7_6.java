package Chapters.BitiyorGonlumunEfendisi.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E7_6 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int number = 2;
        int count = 0;

        while (count <= 50) {
            if (isPrime(number)) {
                set.add(number);
                count++;
            }
            number++;
        }
        System.out.println(Arrays.toString(set.toArray()));
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
