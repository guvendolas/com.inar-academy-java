package Chapters.Chapter_09.E02;

public class C09E2 {
    public static void main(String[] args) {
        Stock s = new Stock("ORCL","OracleCorporation");
        s.previousClosingPrice = 34.5;
        s.currentPrice = 34.35;

        System.out.println("The price change percentage is: " + s.getChangePercent());
    }
}
