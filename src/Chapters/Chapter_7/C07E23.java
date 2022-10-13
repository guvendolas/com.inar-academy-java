package Chapters.Chapter_7;

public class C07E23 {
    public static void main(String[] args) {
        boolean[] doors = new boolean[100];

        int numberOfStudents = 100;

        updateDoors(numberOfStudents, doors);

        displayOpenDoor(doors);

    }

    public static void updateDoors(int numberOfStudents, boolean[] doors) {

        for (int student = 1; student <= numberOfStudents; student++) {
            for (int doorNumber = student - 1; doorNumber < doors.length; doorNumber += student) {

                if (doors[doorNumber]) {
                    doors[doorNumber] = false;
                } else {
                    doors[doorNumber] = true;

                }
            }
        }
    }

    public static void displayOpenDoor(boolean[] doors) {
        for (int i = 0; i < doors.length; i++) {
            if (doors[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
