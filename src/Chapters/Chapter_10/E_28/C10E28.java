package Chapters.Chapter_10.E_28;

public class C10E28 {
    public static void main(String[] args) {
        MyStringBuilder2 myStringBuilder1 = new MyStringBuilder2("GuvenDolas4240".toCharArray());
        MyStringBuilder2 myStringBuilder2 = new MyStringBuilder2("GuvenDolas2111");
        System.out.println(myStringBuilder1);
        System.out.println(myStringBuilder2);
        myStringBuilder1.insert(10,myStringBuilder2.substring(10));
        System.out.println(myStringBuilder1);
        myStringBuilder2.reverse();
        System.out.println(myStringBuilder2);
        myStringBuilder1.reverse();
        System.out.println(myStringBuilder1);


    }
}
