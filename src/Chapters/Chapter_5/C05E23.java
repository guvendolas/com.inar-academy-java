package Chapters.Chapter_5;

public class C05E23 {
    public static void main(String[] args) {
        double a = 0;
        for(double payda = 97.0, pay = 99.0; payda >= 1; payda -= 2, pay -= 2) {
            a += (payda / pay);
        }
        System.out.println(a);
    }
}
