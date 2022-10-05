package Chapters.Chapter_6;

public class C06E26 {
    public static void main(String[] args) {
        final int NUMBER_OF_PALINPRIME = 100;
        int numberPrinted = 0;
        int testedNumber = 2;

        while (numberPrinted < NUMBER_OF_PALINPRIME) {
            if (isPrime(testedNumber) && isPalindrome(testedNumber)) {
                numberPrinted++;
                System.out.print(testedNumber + " ");
                if (numberPrinted % 10 == 0) {
                    System.out.println();
                }
            }
            testedNumber++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int number) {
        int reverse = 0;
        int digit;

        while (number != 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int number) {

        return (number == reverse(number));
    }
}
