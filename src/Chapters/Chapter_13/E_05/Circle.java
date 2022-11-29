package Chapters.Chapter_13.E_05;

public class Circle extends GeometricObject{

    private double radius;

    public Circle(){
        this(0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }
    @Override
    public String toString(){
        return super.toString() + "\nRadius: " + getRadius() + "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}
