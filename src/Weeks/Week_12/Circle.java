package Weeks.Week_12;

public class Circle {
    /**
     * Data field
     */

    String color;
    double radius;
    private double area;
    private double perimeter;
    boolean isFilled;

    /**
     * Constructor
     * <p>
     * 1 - Same Class Name
     * 2 - No return type
     * 3 - Static-Nonstatic is not an option
     */
    public Circle() {
        color = "RED";
        radius = 2;
        isFilled = false;

    }

    public Circle(double r) {
        this();
        radius = r;
    }

    /**
     * Method
     * - Getter / Setter
     * - Method
     */

    public double getArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public void fillTheCircle() {
        isFilled = true;
    }

    public void cleanTheCircle() {
        isFilled = false;
    }

    public void paint(String c) {
        color = c;
    }

    public void print() {
        System.out.println("-------------");
        System.out.println("radius :" + radius);
        System.out.println("perimeter :" + getPerimeter());
        System.out.println("area :" + getArea());
        System.out.println("isFilled :" + isFilled);
        System.out.println("color :" + color);
        System.out.println("-------------");
    }

}
