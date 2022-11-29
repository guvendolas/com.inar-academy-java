package Chapters.Chapter_13.E_02;

import java.util.ArrayList;

public class C13E02 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(1);
        list.add(2.67);
        list.add(4.56);
        list.add(7);
        list.add(2.653);
        list.add(8.412);
        list.add(9);
        System.out.println("before shuffle: " + list.toString());
        shuffle(list);
        System.out.println("after shuffle : " + list.toString());

    }
    public static void shuffle (ArrayList<Number> list) {
        java.util.Collections.shuffle(list);
    }
}
