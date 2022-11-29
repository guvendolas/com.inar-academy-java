package Chapters.Chapter_13.E_06;

public class ComparableCircle extends Circle implements Comparable<Circle>{
    public ComparableCircle(){
        super();
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    @Override
    public int compareTo(Circle circle) {
        return Double.compare(this.getArea(), circle.getArea());
    }
}
