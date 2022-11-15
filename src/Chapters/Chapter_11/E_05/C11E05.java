package Chapters.Chapter_11.E_05;

public class C11E05 {
    public static void main(String[] args) {
        Course course = new Course("İnar Academy");

        course.addStudent("guven");
        course.addStudent("ismail");
        course.addStudent("nurullah");

        System.out.println("Number of student in course " + course.getNumberOfStudents());

        String[] students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
    }
}
