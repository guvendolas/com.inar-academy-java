package Chapters.Chapter_8;

public class C08E10 {
    public static void main(String[] args) {
        int [][] matrix = new int[4][4];
        getRandom(matrix);
        displayMatrix(matrix);

        System.out.println("The largest row index: " + largestRow(matrix));
        System.out.println("The largest column index: " + largestColumn(matrix));

    }
    public static void getRandom (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
    }
    public static void displayMatrix (int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
    public static int largestRow (int [][] m) {
        int maxRowIndex = 0;
        int max = 0;
        for (int row = 0; row < m.length; row++) {
            int count = 0;
            for (int col = 0; col < m[row].length; col++) {
                if (m[row][col] == 1) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    maxRowIndex = row;
            }

            }
        }
        return maxRowIndex;
    }
    public static int largestColumn (int[][] m) {
        int maxColIndex = 0;
        int max = 0;
        for (int col = 0; col < m[0].length; col++) {
            int count = 0;
            for (int row = 0; row < m.length; row++) {
                if (m[col][row] == 1) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    maxColIndex = col;
            }

            }
        }
        return maxColIndex;
    }
}
