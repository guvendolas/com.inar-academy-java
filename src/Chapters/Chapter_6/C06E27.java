package Chapters.Chapter_6;

public class C06E27 {
    public static void main(String[] args) {
        final int NUMBER_OF_EMIRPS = 100;
        int numberPrinted = 0;
        int testedNumber = 2;

        while (numberPrinted < NUMBER_OF_EMIRPS) {

            if (C06E26.isPrime(testedNumber) && C06E26.isPrime(C06E26.reverse(testedNumber))
                    && !C06E26.isPalindrome(testedNumber)) {
                numberPrinted++;
                System.out.printf(testedNumber + " ");

                if (numberPrinted % 10 == 0) {
                    System.out.println();
                }
            }
            testedNumber++;
        }
    }
}
