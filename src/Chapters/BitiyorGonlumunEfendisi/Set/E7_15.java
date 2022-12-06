package Chapters.BitiyorGonlumunEfendisi.Set;
import java.util.*;

public class E7_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten int: ");

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(input.nextInt());
        }
        System.out.println(Arrays.toString(set.toArray()));
    }
}
