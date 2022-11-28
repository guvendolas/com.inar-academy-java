package Chapters.Chapter_12.Chapter_12_Exercises.E_28;

import java.io.File;
import java.util.ArrayList;

public class C12E28 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java C12E28 *");
            System.exit(1);
        }
        ArrayList<File> list = getFiles(args);

        for (int i = 0; i < list.size(); i++) {
            padFileName(list.get(i));
        }
    }
    public static void padFileName(File file) {
        StringBuilder newName = new StringBuilder(file.getName());
        newName.insert(8,0);
        file.renameTo(new File(newName.toString()));
    }
    public static ArrayList<File> getFiles(String[] args) {
        ArrayList<File> list = new ArrayList<>();
        for (String e: args) {
            File f = new File(e);
            if (f.isFile() && f.getName().matches("C\\dE\\d.*")){
                list.add(f);
            }
        }
        return list;
    }
}
