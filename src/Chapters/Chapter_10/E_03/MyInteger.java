package Chapters.Chapter_10.E_03;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isPrime() {
        int number = getValue();

        if (number == 0 || number == 1)
            return false;
        else if (number == 2)
            return true;
        else
            for (int n = 3; n < Math.sqrt(number); n += 2) {
                if (number % n == 0)
                    return false;
            }

        return true;
    }

    public boolean isEven() {
        return getValue() % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public static boolean isPrime(int num) {


        if (num == 0 || num == 1)
            return false;
        else if (num == 2)
            return true;
        else
            for (int n = 3; n < Math.sqrt(num); n += 2) {
                if (num % n == 0)
                    return false;
            }

        return true;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return !isEven(num);
    }


    public static boolean isPrime(MyInteger num) {
        return isPrime(num.getValue());
    }

    public static boolean isEven(MyInteger num) {
        return isEven(num.getValue());
    }

    public static boolean isOdd(MyInteger num) {
        return isOdd(num.getValue());
    }

    public boolean equals(int n) {
        return getValue() == n;
    }

    public boolean equals(MyInteger num) {
        return equals(num.getValue());
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }


    public static int parseInt(char[] arr) {
        //return parseInt(new String(arr));

        int num = 0;
        int v;
        for (int i = arr.length - 1, p = 0; i >= 0; i--, p++) {
            // Cast inti int automatically because ve assign the result to an int variable
            v = arr[i] - '0';
            num += Math.pow(10, p) * v;
        }

        return num;
    }

}
