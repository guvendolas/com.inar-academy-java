package Chapters.Chapter_09.E08;

public class Fan {
    public static int slow = 1;
    public static int medium = 2;
    public static int fast = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = slow;
        on = false;
        radius = 5.0;
        color = "blue";
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return getColor();
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        String s = "";
        if (on) {
            s = "fan speed: " + speed + ", radius: " + radius + ", color: " + color;
        }else {
            s = "Fan is off " + " radius: " + radius + ", color: " + color;
        }
        return s;
    }
}
