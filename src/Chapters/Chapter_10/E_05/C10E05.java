package Chapters.Chapter_10.E_05;

public class C10E05 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
            while (!stack.empty()) {
                System.out.print(stack.pop() + " ");
            }
        }
    }
}
