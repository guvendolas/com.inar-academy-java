package Chapters.Chapter_6;

public class C06E29 {
    public static void main(String[] args) {
        for (int i = 3; i < 1000; i++) {
            if (C06E26.isPrime(i) && C06E26.isPrime(i + 2)) {
                System.out.println("(" + i + "," + (i + 2) + ")");
            }
        }
    }
}
