package Weeks.Week_17;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        MyArrayList.addRandomValuesToTheList(list,15);
        System.out.println(Arrays.toString(list.toArray()));
        printUniqueValuesOnly(list);

    }

    private static void printUniqueValuesOnly(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        set.addAll(list);

        System.out.println(Arrays.toString(set.toArray()));
        System.out.println("There are " + (list.size() - set.size()) + " duplicate values");
    }


}