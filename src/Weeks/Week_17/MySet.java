package Weeks.Week_17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySet {

    /**
     * 1 - Set can only store Objects
     * 2 - Set can only store unique values
     * 3 - Set does  store the values in a random order
     *
     * @param args
     */

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        addRandomValuesToTheList(set,5);


        System.out.println(set.size());
        print(set);
    }

    private static void print(Set set) {
        System.out.println("----------");
        System.out.println(Arrays.toString(set.toArray()));
    }

    private static void addRandomValuesToTheList(Set set, int i) {
        for (int j = 0; j < i; j++) {
            int number = (int)(Math.random()* 10);
            set.add(number);
            System.out.println(number + " Number is added to the set");
        }
    }
}