package Chapters.Chapter_8;

import java.util.Scanner;

public class C08E17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number banks:");
        int n = input.nextInt();

        System.out.print("Enter the limit:");
        int limit = input.nextInt();

        double[] balance = new double[n];
        double[][] borrowers = new double[n][n];
        boolean[] unsafe = new boolean[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the banks " + i + " asset info:");
            balance[i] = input.nextDouble();
            int m = input.nextInt();
            for (int j = 0; j < m; j++) {
                borrowers[i][input.nextInt()] = input.nextDouble();
            }
        }

        boolean unsafeFound = false;
        do {
            unsafeFound = false;
            for (int i = 0; i < n; i++) {
                double asset = balance[i];
                for (int j = 0; j < borrowers[i].length; j++) {
                    asset += borrowers[i][j];
                }

                if (asset < limit) {
                    unsafe[i] = true;
                    for (int j = 0; j < borrowers.length; j++) {
                        if (borrowers[j][i] != 0) {
                            borrowers[j][i] = 0;
                            unsafeFound = true;
                        }
                    }
                }

            }

        } while (unsafeFound);

        System.out.print("The unsafe banks are:");
        for (int i = 0; i < unsafe.length; i++) {
            if (unsafe[i] == true) {
                System.out.print(i + " ");
            }

        }

    }
}
