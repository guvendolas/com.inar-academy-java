package Weeks.Week_15.MyException;

public class Main {
    public static void main(String[] args) throws TooHotCoffeeException, TooColdCoffeeException {
        Person person = new Person();
        System.err.println("BU HATA");
        Coffee turkKahvesi = new Coffee("Turk Kahvesi", 14);
        person.drink(turkKahvesi);
    }
}
