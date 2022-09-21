package Chapters.Chapter_5;

public class C05E07 {
    public static void main(String[] args) {
        int feePerYear = 10000;
        int totalFee = 0;

        for (int i = 1; i <= 14; i++) {
            feePerYear += feePerYear * .05;
            if (i == 10) {
                System.out.println("The tuition fee in ten year is $" + feePerYear);
            }
            if (i > 10) {
                totalFee = totalFee + feePerYear;
            }
        }
        System.out.println("The total cost of 4 years tuition after the tenth year is $" + totalFee);
    }
}



