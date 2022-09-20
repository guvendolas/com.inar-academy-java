package Chapters.Chapter_5;

public class C05E06 {
    public static void main(String[] args) {
        System.out.printf("%-9s%15s", "Miles", "Kilometers");
        System.out.print("\t|\t");
        System.out.printf("%-9s%15s\n", "Kilometers", "Miles");

        for (int j = 20, i = 1; i <= 10; i++, j += 5) {
            System.out.printf("%-9d%15.3f", i, i * 1.609);
            System.out.print("\t|\t");
            System.out.printf("%-9d%15.3f\n", j, j / 1.609);
        }
    }
}
