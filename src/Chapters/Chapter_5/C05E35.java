package Chapters.Chapter_5;

public class C05E35 {
    public static void main(String[] args) {
        double res = 0;
        double a = 1;


        for (int i = 1; i <= 624; i++) {
            res += a / Math.sqrt(i) + Math.sqrt(i + 1);

        }
        System.out.println(res);
    }
}
