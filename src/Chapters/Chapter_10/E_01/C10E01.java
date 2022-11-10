package Chapters.Chapter_10.E_01;

public class C10E01 {
    public static void main(String[] args) {
        Time test1 = new Time();

        Time test2 = new Time(555550000);

        Time test3 = new Time(5, 23, 50);

        System.out.println("Test 1 " + test1.getHour() + ":" + test1.getMinute() + ":" +
                test1.getSecond() + ".");

        System.out.println("Test 2 " + test2.getHour() + ":" + test2.getMinute() + ":" +
                test2.getSecond() + ".");

        System.out.println("Test 3 " + test3.getHour() + ":" + test3.getMinute() + ":" +
                test3.getSecond() + ".");


    }
}
