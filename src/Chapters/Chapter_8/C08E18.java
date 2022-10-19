package Chapters.Chapter_8;

public class C08E18 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shufflingArray(array);
        printArray(array);
    }
    public static void printArray(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                System.out.print(m[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void shufflingArray (int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int row1 = (int)(Math.random() * matrix.length);
                int col1 = (int)(Math.random() * matrix[row].length);

                int temp = matrix[row][col];
                matrix[row][col] = matrix[row1][col1];
                matrix[row1][col1] = temp;
            }
        }
    }
}
