package Chapters.Chapter_11.E_02;

import Chapters.Chapter_10.E_14.MyDate;

public class C11E02 {
    public static void main(String[] args) {
        Person person = new Person("Guven","Uskudar", "0534-000-000","guven@dolas.com");
        Student student = new Student("Celal Sengor" , " Aydın","0563-444-890","celal@sengor.com", Student.FRESMAN);
        Employee employee = new Employee("Steve jobs","LA","333-444","seteve@jobs.com","Tahtakale",100_000, new MyDate());
        Faculty faculty = new Faculty("Ali ökkeş","Belirsiz", "4544-666-555", "ali@okkes.com",
                "Ankara ulusoy", 12_000, new MyDate(), "7/24", "belirsiz");
        Staff staff = new Staff("Bill Gates", "Silikon vadisi no: 5", "333-666",
                "bill@gates.com", "silikon", 200_000, new MyDate(), "Sistem yaratıcı");


        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
