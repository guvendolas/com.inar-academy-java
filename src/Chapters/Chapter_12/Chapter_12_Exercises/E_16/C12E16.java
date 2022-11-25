package Chapters.Chapter_12.Chapter_12_Exercises.E_16;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class C12E16 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println(
                    "Usage: Java Exercise_12_16 file oldString newString");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                list.add(s1.replaceAll(args[1], args[2]));
            }
        }

        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
        }
    }
}
