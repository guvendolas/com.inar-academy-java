package Chapters.BitiyorGonlumunEfendisi.Set;
import java.util.*;
public class E11_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 int for list 1: ");
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            l1.add(input.nextInt());
        }
        System.out.println("Enter 5 int for list 2: ");
        ArrayList<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            l2.add(input.nextInt());
        }
        Set<Integer> set = new HashSet<>();
        set.addAll(l1);
        set.addAll(l2);
        System.out.println(Arrays.toString(set.toArray()));
    }
}
