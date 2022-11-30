package Chapters.Chapter_13.E_10;

public class C13E10 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,4,"Purple",false);
        Rectangle r2 = new Rectangle(5,3,"White",true);

        System.out.println("R1 is " + r1.toString() + "\nR2 is " + r2.toString() +
                "\nAre they equals " + r1.equals(r2));


    }
}
