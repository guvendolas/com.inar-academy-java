package Chapters.Chapter_5;

public class C05E13 {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            if (Math.pow(++count, 3) > 12_000) break;
        }
        System.out.print(count);
    }
}
