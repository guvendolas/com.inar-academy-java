package Chapters.Chapter_6;

public class C06E13 {
    public static void main(String[] args) {
        System.out.println("i                 m(i)");
        System.out.println("--------------------");
        for (double i = 1; i <= 20; i++) {
            System.out.printf("\n%-10s%10.4f", i, sum(i));
        }
    }
    public static double sum (double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += i / (i + 1);
        }
        return sum;
    }
}
