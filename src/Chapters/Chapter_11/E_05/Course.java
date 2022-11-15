package Chapters.Chapter_11.E_05;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<String> students;

    public Course(String name) {
        this.name = name;
        students = new ArrayList<String>();
    }
    public void addStudent(String student) {
        students.add(student);
    }
    public String[] getStudents() {
        String[] s = new String[students.size()];
        return students.toArray(s);
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    public String getName() {
        return name;
    }
    public void dropStudents(String student) {
        students.remove(student);
    }
}
