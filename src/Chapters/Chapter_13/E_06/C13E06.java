package Chapters.Chapter_13.E_06;

public class C13E06 {
    public static void main(String[] args) {


        ComparableCircle c1 = new ComparableCircle(12.51);
        ComparableCircle c2 = new ComparableCircle(14.51);
        ComparableCircle c3 = new ComparableCircle(12.51);

        System.out.println("C1 area = " + c1.getArea() + ", C2 area = " + c2.getArea());
        System.out.print("C1 compareTo C2 = ");
        System.out.println(c1.compareTo(c2));

        System.out.println("C2 area = " + c2.getArea() + ", C1 area = " + c1.getArea());
        System.out.print("C2 compareTo C1 = ");
        System.out.println(c2.compareTo(c1));

        System.out.println("C3 area = " + c3.getArea() + ", C1 area = " + c1.getArea());
        System.out.print("C3 compareTo C1 = ");
        System.out.println(c3.compareTo(c1));
    }
}
