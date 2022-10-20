package Chapters.Chapter_8;

import java.util.Scanner;

public class C08E28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][]arr1=new int[3][3];
        fillArray(arr1);
        print(arr1);

        System.out.println();

        int[][]arr2=new int[3][3];
        fillArray(arr2);
        print(arr2);
        System.out.println("\nthe arr1 and arr2 is  "+(equals(arr1,arr2)?"strictly equal":" not strictly equal"));

    }

    public static boolean equals(int[][] m1, int[][] m2){
        if(m1.length!=m2.length){ //we can check all rows length but now it is not necessary
            return false;
        }
        for (int row = 0; row <m1.length ; row++) {
            for (int col = 0; col <m1[row].length ; col++) {// ı write m1[row] because ı want a dynamıc
                if (m1[row][col]!=m2[row][col]){
                    return false;
                }
            }
        }
        return  true;
    }
    public static void print (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
    public static void fillArray (int[][] m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
    }
}
