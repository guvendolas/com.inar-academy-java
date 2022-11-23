package Chapters.Chapter_12.Chapter_12_Exercises.E_10;

public class C12E10 {
    public static void main(String[] args) {
        try {
            long[] testHeap = new long[50];
            for (int loop = 0; ; loop++) {
                testHeap = new long[testHeap.length * 4];
            }
        }
        catch (OutOfMemoryError e) {
            System.out.println("Out of Memory Error: " + e);
        }
    }
}
