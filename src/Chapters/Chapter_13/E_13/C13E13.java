package Chapters.Chapter_13.E_13;

public class C13E13 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Course course = new Course("Inar Academy");

        course.addStudent("güven");
        course.addStudent("ismail");
        course.addStudent("nurullah");

        Course course1 = course.clone();

        course1.addStudent("ali");
        course1.addStudent("ahmet");
        System.out.println("\nNumber of students in course1: "
                + course.getNumberOfStudents());
        String[] students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
        System.out.println();

        System.out.println("\nNumber of students in course2: "
                + course1.getNumberOfStudents());
        String[] students2 = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students2[i] + ", ");
        System.out.println();
    }
}
