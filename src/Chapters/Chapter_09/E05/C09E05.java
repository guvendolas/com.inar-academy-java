package Chapters.Chapter_09.E05;

import java.util.GregorianCalendar;

public class C09E05 {
    public static void main(String[] args) {
        GregorianCalendar first = new GregorianCalendar();
        System.out.println("\nTime is " + first.get(first.YEAR) + " " + first.get(first.MONTH) + " " + first.get(first.DAY_OF_MONTH));

        GregorianCalendar second = new GregorianCalendar();
        second.setTimeInMillis(1234567898765L);
        System.out.println("\nTime is " + second.get(second.YEAR) + " " + second.get(second.MONTH) + " " + second.get(second.DAY_OF_MONTH));

    }
}
