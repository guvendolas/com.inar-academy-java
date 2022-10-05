package Chapters.Chapter_6;

public class C06E28 {
    public static void main(String[] args) {
        System.out.printf("%-8s%10s\n", "p", "2^p-1");
        System.out.println("--------------------");

        for (int p = 2; p <= 31; p++) {
            if (C06E26.isPrime(p)) {
                System.out.printf("%-13d", p);
                System.out.println(mersennePrime(p));
            }
        }
    }

    public static int mersennePrime(int num) {
        return (int) Math.pow(2, num) - 1;

    }

}
