package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E02 {
    public static void main(String[] args) {
        int numberOfQuestions = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < numberOfQuestions) {
            int number1 = (int) (Math.random() * 15);
            int number2 = (int) (Math.random() * 15);

            System.out.print("What is " + number1 + " + " + number2 + " ? ");
            int answer = input.nextInt();
            if (number1 + number2 == answer) {
                System.out.println("You are correct");
                correctCount++;
            } else {
                System.out.println("Wrong! " + number1 + " + " + number2 + " Should be " + (number1 + number2));
                count++;
                output += "\n" + number1 + " + " + number2 + " = " + answer +
                        ((number1 + number2 == answer) ? " correct" : " wrong");
            }

        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);


    }
}
