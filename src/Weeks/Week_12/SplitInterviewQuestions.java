package Weeks.Week_12;

import java.util.Scanner;
import java.util.Arrays;

public class SplitInterviewQuestions {
    /**
     * Code review - Peer review
     * @param args
     */

    public static void main(String[] args) {
        findJavaInCV();
    }

    public static void deneme(){
        String s1 = "I love Inar Academy";
        /**
         * I
         * love
         * Inar
         * Academy
         */
        String[] arr = s1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void findJavaInCV(){
        String cv = "   Java Java Java ";
//        String a = cv.trim();
//        a.split("Java");
        String[] arr = cv.trim().split("Java");

        //whitespace : space, tab, newLine
        /**
         * [0] - Tarik\n I have been working at Amazon for about 4 years.I am using
         * [1] - in my KILT project. The backend is developed by Using
         * [2] -  Spring
         */
//        SplitInterviewQuestion sq = new SplitInterviewQuestion();
//        sq.display(arr);
        display(arr);
        int count = arr.length;
        System.out.println(count);

        Scanner input = new Scanner(System.in);
    }

    private static void display(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
