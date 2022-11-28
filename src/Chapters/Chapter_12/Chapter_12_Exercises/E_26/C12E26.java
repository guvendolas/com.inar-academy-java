package Chapters.Chapter_12.Chapter_12_Exercises.E_26;

import java.io.File;
import java.util.Scanner;

public class C12E26 {
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        System.out.println("Enter directory name: ");
        File dir = new File(input.next());

        if (dir.isDirectory()) {
            System.out.println("Directory already exists");
            System.exit(0);
        }
        if (dir.mkdir()) {
            System.out.println("Directory created successfully");
        }
    }
}
