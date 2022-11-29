package Chapters.Chapter_13.E_03;

import java.util.ArrayList;

public class C13E03 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        list.add(1.6);
        list.add(2.67);
        list.add(4.56);
        list.add(7.4);
        list.add(2.653);
        list.add(8.412);
        list.add(9.1);

        System.out.println(list.toString());
        sort(list);
        System.out.println(list.toString());
    }
    public static void sort (ArrayList<Double> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Double min = list.get(i);
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (min.doubleValue() > list.get(j).doubleValue()) {
                    min = list.get(j);
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list.set(minIndex, list.get(i));
                list.set(i, min);
            }
        }
    }
}
