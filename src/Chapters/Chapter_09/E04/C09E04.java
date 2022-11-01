package Chapters.Chapter_09.E04;

import java.util.Random;

public class C09E04 {
    public static int seed = 1000;
    public static int number = 100;

    public static void main(String[] args) {
        Random random = new Random(seed);
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println();
            } else {
                System.out.println(random.nextInt(number) + " ");
            }
        }
    }
}
