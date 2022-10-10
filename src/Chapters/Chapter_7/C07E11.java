package Chapters.Chapter_7;

import java.util.Scanner;

public class C07E11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double[] n = new double[10];
        for (int i = 1; i < n.length; i++) {
            n[i] = input.nextDouble();
        }
        System.out.println("the deviation is " + deviation(n));
    }
    public static double mean (double[] x) {
        double mean = 0;
        for (int i = 0; i < x.length; i++) {
            mean += i;
        }
        return mean / x.length;
    }
    public static double deviation (double[] x) {
        double deviation = 0;
        double mean = mean(x);
        for (int i = 0; i < x.length; i++) {
            deviation += Math.pow(i - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
        }
    }

