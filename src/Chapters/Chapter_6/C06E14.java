package Chapters.Chapter_6;

public class C06E14 {
    public static void main(String[] args) {
        System.out.println("i               m(i)");
        System.out.println("--------------------");
        for (double i = 1; i <= 901; i += 100) {
            System.out.printf("\n%-10.0f%10.4f", i, sum(i));
        }
    }

    public static double sum(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 4 * (Math.pow(-1, i + 1) / (2 * i - 1));
        }
        return sum;
    }
}
