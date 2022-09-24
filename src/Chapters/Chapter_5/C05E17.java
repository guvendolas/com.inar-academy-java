package Chapters.Chapter_5;

import java.util.Scanner;

public class C05E17 {
    /**public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = num - 1 - i; j > 0; j--) {
                System.out.print("   ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.printf("%3d", j);
            }
            for (int j = 2; j < i + 2; j++) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }


    }



}*/
    public static void main(String[] args) {
        System.out.print("Enter the number of lines: ");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();

        for (int satir = 1; satir <= sayi; satir++) {
            firstLoop(sayi, satir);
            secondLoop(satir);
            if(satir >= 2){
                thirdLoop(satir);
            }
            System.out.println();
        }
    }

    public static void thirdLoop(int satir){
        for (int sutun = 2; sutun <= satir ; sutun++) {
            System.out.printf("%3d",sutun);
        }
    }

    public static void secondLoop(int satir) {
        for (int sutun = satir; sutun >= 1; sutun--) {
            System.out.printf("%3d",sutun);
        }
    }

    public static void firstLoop(int sayi, int satir) {
        for (int sutun = sayi - satir; sutun > 0; sutun--) {
            System.out.print("   ");
        }
    }


}

