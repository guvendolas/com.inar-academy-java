package Chapters.Chapter_5;

public class C05E20 {
    public static void main(String[] args) {
        final int UPPER_BOUND = 1000;
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        int count = 0;
        int number = 2;

        System.out.println("The prime numbers in from 2 to 1000 are");

        while (number <= UPPER_BOUND) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.println(number);
                } else
                    System.out.print(number + " ");
            }
            number++;
        }
    }
}
