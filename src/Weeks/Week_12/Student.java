package Weeks.Week_12;

public class Student {
    /**
     *
     */

    private static int studentCounter;

    private String isim;
    private String soyIsim;
    private int id;
    private String email;
    public final static String ACADEMY = "Inar Academy"; //constant

    public String publicAccessModifier;
    String defaultAccessModifier;//package private - default
    private String privateAccessModifier;
    protected String protectedAccessModifier;


    public Student() {
        this("","",0,"");
//        this.isim = "";
//        this.soyIsim = "";
//        this.email = "";
//        this.id = 0;
//        studentCounter++;
    }

    public Student(String isim, String soyIsim, int id, String email) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.id = id;
        this.email = email;
        studentCounter ++;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return this.soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print(){
        System.out.printf("Isim:%s\nSoyIsim:%s\nId:%d\nEmail:%s\n",this.isim,this.soyIsim,this.id,this.email);
        System.out.println("-------");
    }

    public static void printDataFields(){
        System.out.println("Isim - Soyisim - Id - Email");
    }

    public static int getStudentCounter(){
        return studentCounter;
    }
}
