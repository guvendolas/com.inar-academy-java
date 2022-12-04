package Chapters.BitiyorGonlumunEfendisi.ArrayLists;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class E20_01 {
    public static void main(String[] args) throws Exception{
        if (args.length != 1) {
            System.out.println("must be 1");
            System.exit(0);
        }
        File file = new File(args[0]);
        ArrayList<String> list = new ArrayList<>();

        try (Scanner input = new Scanner(System.in);){
            while (input.hasNext()) {
                String s = input.next();
                if (Character.isLetter(s.charAt(0))) {
                    list.add(s);
                }
            }
        }
        java.util.Collections.sort(list);
        System.out.println(list.toString());
    }
}
