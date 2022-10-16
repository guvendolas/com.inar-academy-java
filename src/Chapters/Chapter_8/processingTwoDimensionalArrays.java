package Chapters.Chapter_8;

public class processingTwoDimensionalArrays {
    public static void main(String[] args) {
        int [][] matrix = new int[10][10];
        randomValues(matrix);
        GetPrintMatrix(matrix);
        int sum = summingAllElements(matrix);
        System.out.println("All elements sum is " + sum);
        summingElelmentsByColumn(matrix);
        whichRowHasLargestSum(matrix);
        randomShuffling(matrix);
        GetPrintMatrix(matrix);

    }

    public static void GetPrintMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void randomValues(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int)(Math.random() * 100);
            }
        }
    }
    public static int summingAllElements (int [][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        return sum;
    }
    public static void summingElelmentsByColumn (int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][col];
            }
            System.out.println("sum for column " + col + " is " + total);
        }

    }
    public static void whichRowHasLargestSum (int[][] matrix) {
        int maxRow = 0;
        int indexOfMaxRow = 0;

        for (int col = 0; col < matrix[0].length; col++) {
            maxRow += matrix[0][col];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                totalOfThisRow += matrix[row][col];

                if (totalOfThisRow > maxRow) {
                    maxRow = totalOfThisRow;
                    indexOfMaxRow = row;
                }
            }
            System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
        }
    }
    public static void randomShuffling (int[][] matrix) {
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
