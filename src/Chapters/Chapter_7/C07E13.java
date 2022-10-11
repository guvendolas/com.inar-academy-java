package Chapters.Chapter_7;

public class C07E13 {
    public static void main(String[] args) {
        System.out.println("Random number is " + getRandom());
    }

    public static int getRandom(int... numbers) {
        int randomInt = (int) (1 + Math.random() * 54);
        for (int num = 0; num < numbers.length; num++) {
            if (randomInt == num) {
                return getRandom(numbers);
            }
        }
        return randomInt;
    }
}
