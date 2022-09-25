package Chapters.Chapter_5;

public class C05E25 {
    public static void main(String[] args) {
        double pi = 0;
        for (int i = 0; i <= 100_000; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
            if (i == 10_000) {
                System.out.println("10000 is " + (pi * 4));
            }
            if (i == 20_000) {
                System.out.println("20000 is " + (pi * 4));
            }
            if (i == 100_000) {
                System.out.println("100000 is " + (pi * 4));
            }
        }
    }
}
