package Weeks.Week_14;

public class testPolymorphishm {
    public static void main(String[] args) {


        Animal animal = new Animal();
        Lion lion = new Lion();
        lion.eats();
        /** 4 access modifiers
         *  - private - only visible to the same class
         *  -         - (default) (package private) is only visible to the same package
         *  - protected - visible to package + to child classes
         *  - public - visible to everyone
         */

        lion.eats();
        lion.animalMethod();
        System.out.println(lion);

        Lion lion2 = new Lion(10);
        System.out.println("--------");
        System.out.println(lion2);

        Math.max(5, 6);

    }
}
