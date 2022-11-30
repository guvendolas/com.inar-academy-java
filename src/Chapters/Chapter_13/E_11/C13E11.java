package Chapters.Chapter_13.E_11;

public class C13E11 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon1 = new Octagon(8);

        System.out.println(octagon1.toString());

        Octagon octagon2 = (Octagon)octagon1.clone();

        int result = (octagon1.compareTo(octagon2));
        if (result == 1)
            System.out.println("Octagon is greather than its clone.");
        else if (result == -1)
            System.out.println("Octagon is less than its clone.");
        else
            System.out.println("Octagon is equal to its clone.");
    }
}
