package Chapters.Chapter_5;

public class C05E26 {
    public static void main(String[] args) {

        double e = 1;
        double a = 1;

        for (int i = 2; i <= 100_000; i++) {
            a = a / (i * (i - 1));
            e += a;

            if (i == 10_000) {
                System.out.println("i = 10.000: " + e);
            }
            else if (i == 20_000) {
                System.out.println("i = 20.000: " + e);
            }
            else if (i == 100_000) {
                System.out.println("i = 100.000: " + e);
            }
        }
    }
}
