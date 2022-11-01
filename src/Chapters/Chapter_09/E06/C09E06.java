package Chapters.Chapter_09.E06;

import java.util.Arrays;
import java.util.Random;

public class C09E06 {
    public static void main(String[] args) {
        int[] num = new int[100000];
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            num[i] = random.nextInt(10000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Start time: " + stopWatch.getStartTime() + " ms");

        Arrays.sort(num);
        stopWatch.stop();

        System.out.println("End time: " + stopWatch.getEndTime() + " ms");

        System.out.println("Elapsed time is: " + stopWatch.getElapsedTime() + " ms");
    }
    }
