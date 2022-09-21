package Chapters.Chapter_5;

public class C05E15 {
    public static void main(String[] args) {
        int start = '!';
        int end = '~';
        int count = 0;
        for (int i = start; i <= end; i++) {
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
            System.out.print((char) i + " ");
        }
    }
}
