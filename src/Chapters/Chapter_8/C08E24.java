package Chapters.Chapter_8;

import java.util.Scanner;

public class C08E24 {
    public static void main(String[] args) {
        int[][] grid = fillSolution();

        System.out.println(isValid(grid) ? "Valid solution" :
                "Invalid solution");
    }

    private static boolean isValid(int[][] grid) {

        return checkBlocks(grid) && checkRow(grid) && checkCol(grid);
    }

    public static int[][] fillSolution() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt();

        return grid;
    }

    public static boolean checkBlocks( int n[][]) {
        for (int i = 0; i < n.length; i+=3) {
            for (int j = 0; j < n[i].length; j+=3) {
                if (!checkBlock(i,j,n)){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean checkBlock(int row, int col, int[][] n) {
        int[] seq = new int[9];
        for (int i = 0; i < seq.length; i++) {
            seq[i] = n[i/3][i%3];
        }
        return checkSeq(seq);
    }

    public static boolean checkRow(int n[][]) {
        int[] seq = new int[9];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                seq[j] = n[i][j];
            }
            if(!checkSeq(seq)) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkCol(int n[][]) {
        int[] seq = new int[9];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                seq[j] = n[j][i];
            }
            if(!checkSeq(seq)) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkSeq(int n[]) {
        boolean[] tray = new boolean [n.length];
        boolean result =true;

        for (int i = 0; i < tray.length; i++) {
            tray[n[i]-1] = true;
        }

        for (int j = 0; j < tray.length; j++) {
            result &= tray[j];
        }

        return result;
    }
}
