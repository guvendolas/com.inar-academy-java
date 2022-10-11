package Chapters.Chapter_7;

import java.util.Scanner;

public class C07E12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] reversedNumbers = reverse(numbers);

        for (int i : reversedNumbers) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverse(int[] number) {
        int temp;
        for (int i = 0, j = number.length - 1; i < number.length / 2; i++, j--) {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
        }

        return number;
    }
}
