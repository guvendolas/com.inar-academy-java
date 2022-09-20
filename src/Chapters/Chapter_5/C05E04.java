package Chapters.Chapter_5;

public class C05E04 {
    public static void main(String[] args) {
        System.out.printf("%9s%15s\n", "Miles", "kilometers");
        for (int i = 1; i <=10; i++) {
            System.out.printf("%6d%15.3f\n", i, i * 1.609);
        }
    }
}
