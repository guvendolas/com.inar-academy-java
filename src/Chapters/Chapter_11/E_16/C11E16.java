package Chapters.Chapter_11.E_16;

import java.util.ArrayList;
import java.util.Scanner;

public class C11E16 {
    public static void main(String[] args) {
        quiz();
    }

    public static void quiz() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> guess = new ArrayList<>();

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.println("what is " + number1 + " + " + number2 + " ?");
        int answer = input.nextInt();

        while (answer != number1 + number2) {

            if (guess.contains(answer)) {
                System.out.println("Try again. What is " + number1 + " + " + number2 + " ?");
                answer = input.nextInt();

            } else {
                guess.add(answer);
                System.out.println("wrong! Try again. What is " + number1 + " + " + number2 + " ?");
                answer = input.nextInt();
            }
        }
        System.out.println("Correct!");
    }
}

