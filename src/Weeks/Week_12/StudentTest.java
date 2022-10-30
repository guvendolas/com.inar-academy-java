package Weeks.Week_12;

public class StudentTest {
    public static void main(String[] args) {
        Student haluk = new Student("Haluk", "Inar",425,"haluk@inar.com");
//        haluk.print();
        haluk.setEmail("haluk@gmail.com");
//        haluk.print();

        Student murat = new Student();
        murat.print();

        murat.setIsim("Murat");
        murat.setSoyIsim("Inar");

        murat.print();

        murat.setId(897);
        murat.setEmail("murat@inar.com");

        int muratinIdsi = murat.getId();
        System.out.println("Id " + muratinIdsi);

        String muratinEmail = murat.getEmail();

        System.out.println("STUDENT NUMBER = " + Student.getStudentCounter() );


        Student nurullah = new Student("Nurullah", "Inar", 765, "Nurullah@inar.com");
        System.out.println("STUDENT NUMBER = " + Student.getStudentCounter() );

        Student tarik = new Student();
        System.out.println(tarik.defaultAccessModifier);
        System.out.println(tarik.protectedAccessModifier);



    }
}
