package Chapters.Chapter_7;

public class C07E16 {
    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = intRandom(0, 100000);
        }

        int key = intRandom(0, 100000);
        long startTime = System.currentTimeMillis();
        int i = linearSearch(array, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println(startTime + "," + endTime);

        System.out.println("The key is " + key + " and it is now at " + i);
        System.out.println("The execution time for linear search is "
                + executionTime);

        startTime = System.currentTimeMillis();
        selectionSort(array);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("The execution time for selection sort is "
                + executionTime);


        startTime = System.currentTimeMillis();
        i = binarySearch(array, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("The key is " + key + " and it is at " + i);
        System.out.println("The execution time for binary search is "
                + executionTime);

    }

    public static int intRandom(int lowerBound, int upperBound) {
        return (int) (lowerBound + Math.random()
                * (upperBound - lowerBound + 1));
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1;
    }
}
