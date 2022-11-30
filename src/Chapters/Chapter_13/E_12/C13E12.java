package Chapters.Chapter_13.E_12;

public class C13E12 {
    public static void main(String[] args) {
        GeometricObject[] arr = {new Circle(3), new Circle(5),
        new Rectangle(2,6), new Rectangle(3,5)};

        System.out.println("Total area is " + sumArea(arr));

    }
    public static double sumArea(GeometricObject[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getArea();
        }
        return sum;
    }
}
