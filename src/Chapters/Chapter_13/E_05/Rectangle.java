package Chapters.Chapter_13.E_05;

public class Rectangle extends GeometricObject{

    private double width;
    private double height;

    public Rectangle(double v) {
        this(1,1);
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        double area = this.width * this.height;
        return area;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }
    @Override
    public String toString() {
        return super.toString() + "\nWidth:" + this.width + "\nHeight: " + this.height +
                "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
