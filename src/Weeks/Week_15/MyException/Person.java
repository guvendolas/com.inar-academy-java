package Weeks.Week_15.MyException;

public class Person {
    public void drink(Coffee coffee) throws TooHotCoffeeException, TooColdCoffeeException {
        if(coffee.getTemp() > 80){
            TooHotCoffeeException hata = new TooHotCoffeeException();
            throw hata;
        }else if(coffee.getTemp() < 40){
            throw new TooColdCoffeeException();
        }else{
            System.out.println("I drink coffee");
        }
    }
}
