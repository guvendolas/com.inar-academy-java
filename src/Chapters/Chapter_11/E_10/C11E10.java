package Chapters.Chapter_11.E_10;

import java.util.Scanner;

public class C11E10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack stack = new MyStack();

        System.out.println("Enter five String: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }
        System.out.println("Stack: " + stack.toString());
        while (stack.size() > 0) {
            System.out.print(stack.pop());
        }
    }
}
