package Chapters.Chapter_10.E_11;

public class C10E11 {
    public static void main(String[] args) {
        Circle2D circle = new Circle2D(2,2,5.5);

        System.out.println("Circle area is " + circle.getArea());
        System.out.println("Circle perimeter is " + circle.getPerimeter());
        System.out.println("does circle contains (3,3)? " + circle.contains(3,3));
        System.out.println("does circle contain the (4,5) and radius 10.5? " + circle.contains(new Circle2D(4,5,10.5)));
        System.out.println("does circle overlap (3,5) and radius 2.3? " + circle.overlaps(new Circle2D(3,5,2.3)));
    }
}
