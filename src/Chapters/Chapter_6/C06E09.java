package Chapters.Chapter_6;

public class C06E09 {
    public static void main(String[] args) {
        System.out.print("Feet     ");
        System.out.print(" Meters    ");
        System.out.print("|     Meters     ");
        System.out.println("Feet   ");
        System.out.print("-------------------------------------------------------");
        double feet = 1.0;
        double meters = 20.0;

        while (feet <= 10.0 && meters <= 65.0) {
            System.out.println();
            System.out.printf("%-12.1f%-14.3f", feet, footToMeter(feet));
            System.out.printf(" |%10.1f%15.3f", meters, meterToFoot(meters));

            feet += 1.0;
            meters += 5.0;
        }
    }
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
