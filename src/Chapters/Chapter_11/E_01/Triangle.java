package Chapters.Chapter_11.E_01;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        return area;
    }
    public double getPerimeter() {
         double p = this.side1 + this.side2 + this.side3;
         return p;
    }
    public String toString() {
        return "Triangle: Side 1: " + this.side1 + " Side 2: " + this.side2 + " Side 3: " + this.side3;
    }

}
