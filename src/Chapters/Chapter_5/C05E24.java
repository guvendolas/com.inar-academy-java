package Chapters.Chapter_5;

public class C05E24 {
    public static void main(String[] args) {
        final int N = 50000;
        double sumL2R =0, sumR2L = 0;


        for(int i=1 ; i<=N; i++){
            sumL2R += 1.0/i;
            sumR2L += 1.0/(N-i+1);

        }

        System.out.println("Summation from left to right:" + sumL2R);
        System.out.println("Summation from right to left:" + sumR2L);
    }
}
