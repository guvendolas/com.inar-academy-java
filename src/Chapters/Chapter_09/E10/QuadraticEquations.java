package Chapters.Chapter_09.E10;

public class QuadraticEquations {
    private double a;
    private double b;
    private double c;

    public QuadraticEquations(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return (getB() * getB()) - (4 * (getA() * getB()));
    }
    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        double root1 = ((-getB()) + (Math.sqrt(getDiscriminant()))) / (2 * getA());
        return root1;
    }
    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        double root2 = ((- getB()) - (Math.sqrt(getDiscriminant()))) / (2 * getA());
        return root2;
    }

}
