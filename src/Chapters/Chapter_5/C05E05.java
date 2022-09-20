package Chapters.Chapter_5;

public class C05E05 {
    public static void main(String[] args) {
        System.out.printf("%-9s%15s", "kilograms", "pounds");
        System.out.print("\t|\t");
        System.out.printf("%-9s%15s\n", "pounds", "kilograms");

        for (int j = 20, i = 1; i <= 199; i += 2, j += 5) {
            System.out.printf("%-9d%15.1f", i, i * 2.2);
            System.out.print("\t|\t");
            System.out.printf("%-9d%15.2f\n", j, j / 2.2);
        }
    }
}
