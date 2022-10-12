package Chapters.Chapter_7;

public class C07E29 {
    public static void main(String[] args) {
        int sum = 0, numberOfPick = 0;
        while (sum != 24) {
            sum = pickCard() + pickCard() + pickCard() +pickCard();
            numberOfPick++;

        }

        System.out.println("Number of picks:" + numberOfPick * 4);
    }

    public static int pickCard() {
        int card = (int) (Math.random() * 52.0);
        return card;
    }

    public static int getRank(int card) {

        return card / 4 + 1;

    }
}
