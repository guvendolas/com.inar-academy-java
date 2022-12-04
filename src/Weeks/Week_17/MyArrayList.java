package Weeks.Week_17;


import java.util.*;

/**
 * 1 - Arraylist does not have a certain size during instantiation
 * 2 - Arraylist does only store objects (primitive data type)
 * 3 - Arraylist stores data in sequence
 */
public class MyArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        listMethodExamples();
        addRandomValuesToTheList(list,5);
        print(list);

        System.out.println("The minimum values is " + min(list));
        System.out.println("The index is " + indexOfSmallestElement(list));


    }

    private static void listMethodExamples() {
        List<Double> list = new ArrayList<>();
        int[] arr = new int[5];
        list.add(12.0);
        list.add(24.5);
        list.add(14.5);
        double d = list.get(2);
        list.size();
        list.set(2,19.0);
        print(list);
        list.clear();
        print(list);
        System.out.println(list.contains(19));
        list.isEmpty();
    }

    public static void addRandomValuesToTheList(List list,int i) {
        for (int j = 0; j < i; j++) {
            list.add((int)(Math.random()* 10));
        }
    }

    public static void print(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------");
    }

    public static Integer min(List list){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {

            if((int) list.get(i) < min){
                min = (int) list.get(i);
            }
        }
        return min;
    }

    public static int indexOfSmallestElement(List list){
        int minIndex = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if((int) list.get(i) < min){
                min = (int) list.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }
}