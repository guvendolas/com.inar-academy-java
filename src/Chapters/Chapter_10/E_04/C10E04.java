package Chapters.Chapter_10.E_04;

public class C10E04 {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(0,0);
        MyPoint myPoint1 = new MyPoint(10,30.5);
        System.out.println(myPoint1.distance(myPoint));
    }
}
