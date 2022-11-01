package Chapters.Chapter_09.E08;

public class C09E08 {
    public static void main(String[] args) {
        Fan one = new Fan();

        one.setSpeed(Fan.fast);
        one.setRadius(10);
        one.setColor("yellow");
        one.setOn(true);

        System.out.println("Fan one is " + one.toString());

        Fan two = new Fan();

        two.setSpeed(Fan.fast);
        two.setRadius(5);
        two.setColor("Blue");
        two.setOn(false);

        System.out.println("Fan two is " + two.toString());
    }
}
