package Chapters.Chapter_12.Chapter_12_Exercises.E_23;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C12E23 {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt");

            Scanner input = new Scanner(System.in);

            while (input.hasNext()) {
                list.add(input.nextDouble());
            }

            double total = sum(list);

            System.out.println("Total scores: " + total);
            System.out.println("Average scores: " + (total / list.size()));
        }
        catch (java.net.MalformedURLException ex) {
            System.out.println("invalid URL");
        }
        catch (InputMismatchException ex) {
            System.out.println("Wrong input");
        }
    }
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
