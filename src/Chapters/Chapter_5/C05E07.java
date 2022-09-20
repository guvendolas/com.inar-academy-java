package Chapters.Chapter_5;

public class C05E07 {
    public static void main(String[] args) {
        double total = 0;
        double tuition = 10_000;
        int year = 0;
        while (year < 14) {
            tuition += 0.05 * tuition;
            if (year == 10)
                System.out.printf("Tuition in 10 years: $%1.2f\n", tuition);

            if (year >= 10) {
                total += tuition;
            }
            if (year == 13)
                System.out.printf("In 10 years 4 years of tuition will cost $%1.2f", total);
            year++;
        }
    }


}
