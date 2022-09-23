package Chapters.Chapter_5;

public class C05E18 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("Pattern B");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        int number = 6;
        System.out.println("Pattern C");
        for (int i = 1; i <= number; i++) {
            for (int s = number - i; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int k = i; k  >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        System.out.println(" Pattern D");
        for (int i = 0; i  < 6; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }
            for (int c = 0; c < 6 - i; c++) {
                System.out.print((c + 1) + " ");
            }
            System.out.println();
        }

    }
}
