package Chapters.Chapter_5;

public class C05E03 {
    public static void main(String[] args) {
        System.out.printf("%9s%15s\n", "kilograms", "pounds");

        for (int i = 1; i <= 199; i++) {
            System.out.printf("%-9d%15.1f\n", i, i * 2.2);

        }
    }
}
