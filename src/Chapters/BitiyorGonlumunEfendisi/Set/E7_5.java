package Chapters.BitiyorGonlumunEfendisi.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E7_5 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();

            set.add(num);
        }
        System.out.println(Arrays.toString(set.toArray()));
    }
}
