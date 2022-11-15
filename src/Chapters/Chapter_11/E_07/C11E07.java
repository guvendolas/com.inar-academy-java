package Chapters.Chapter_11.E_07;

import java.util.ArrayList;

public class C11E07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println("after shuffle ");
        shuffle(list);
        System.out.println(list);

    }
    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int random = (int)(Math.random() * list.size());
            int temp = list.get(random);
            list.set(random, list.get(i));
            list.set(i,temp);
        }
    }
}
