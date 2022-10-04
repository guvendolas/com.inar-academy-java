package Chapters.Chapter_6;

public class C06E16 {
    public static void main(String[] args) {
        System.out.println("Year           Total Days");
        System.out.print("__________________________");
        for (int year = 2000; year <= 2020; year++) {
            System.out.print("\n" + year + "              " + numberOfDaysInAYear(year));

        }
    }

    public static int numberOfDaysInAYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
