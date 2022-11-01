package Chapters.Chapter_09.E03;

import java.util.Date;

public class C09E03 {
    public static int start = 1000;
    public static long finish = 100000000;
    public static void main(String[] args) {

        for (int i = start; i < finish; i *= 10) {
            Date date = new Date(i);
            System.out.println("Date is " + date.toString());
        }
    }
}
