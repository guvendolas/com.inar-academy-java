package Chapters.Chapter_7;

import java.util.Scanner;

public class C07E01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int []  grade = new int[numberOfStudents];
        System.out.println("Enter " + numberOfStudents + " students score");
        for (int i = 0; i < numberOfStudents; i++) {
            grade[i] = input.nextInt();
        }
        bestGrade(grade);
        printletterForGrades(grade,bestGrade(grade));

    }
    public static int bestGrade (int [] grade) {
        int best = -1;
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] > best){
                best = grade[i];
            }
        }
        return best;
    }
    public static void printletterForGrades(int [] grade, int bestGrade){
        char letterNotes = ' ';
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] >= (bestGrade - 10)) {
                letterNotes = 'A';
            }else if (grade[i] >= (bestGrade - 20)) {
                letterNotes = 'B';
            } else if (grade[i] >= (bestGrade - 30)) {
                letterNotes = 'C';
            } else if (grade[i] >= (bestGrade - 40)) {
                letterNotes = 'D';
            }else {
                letterNotes = 'F';
            }
            System.out.println("Student " + i + " score is " + grade[i] + " and grade is " + letterNotes);
        }
    }

}
