package Chapters.Chapter_12.Chapter_12_Exercises.E_11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class C12E11 {
    public static void main(String[] args)  throws Exception {
        String toRemove = args[0];

        File sourceFile = new File(args[1]);

        if (!sourceFile.exists()) {
            System.out.println("The file " + sourceFile.getName() + "does not exist.");
            System.exit(1);
        }

        Scanner input = new Scanner(sourceFile);


        String str1 = "";
        String str2 = "";

        while (input.hasNext()) {

            str1 += input.nextLine();
            str2 = str1.replaceAll(toRemove, "");

        }

        File targetFile = new File(toRemove + "_Revised.txt");

        try (
                PrintWriter out = new PrintWriter(targetFile);
        ) {
            out.print(str2);
        }

        System.out.println("Your edited file is complete.");

    }
}
