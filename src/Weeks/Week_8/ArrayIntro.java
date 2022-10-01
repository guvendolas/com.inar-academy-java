package Weeks.Wekk_8;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declaration
        int[] arr;

        //Creation + Assignment
        arr = new int[5];
        String ss = "";
        //Combined
        int[] students = new int[5];

// OTHER ARRAY CREATION TYPES
        int[] list = {3, 7, 9};
        int[] list2 = new int[]{5, 7, 9};


        for (int i = 0; i < arr.length; i++) {
            students[i] = input.nextInt();
        }
        int sum = sumAllStundetPoints(students);
        double average = sum / (students.length * 1.0);
        printOutTheStudentBelowAverage(students, average);


//FOR EACH

        int[] ls = new int[5];
        ls[0] = 30;
        ls[1] = 56;
        ls[2] = 61;
        ls[3] = 87;
        ls[4] = 99;

        for (int i = 0; i < ls.length; i++) {
            System.out.println(ls[i]);
        }
        System.out.println("------------------");

        for (int num : ls) {
            System.out.println(num);
        }

    }

    private static void printOutTheStudentBelowAverage(int[] students, double average) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] < average) {
                System.out.printf("Student %d is grade is %d. He is below average(%f)\n", i, students[i], average);
            }
        }
    }

    private static int sumAllStundetPoints(int[] students) {
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i];
        }
        return sum;
    }
}
