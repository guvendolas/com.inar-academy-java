package Weeks.Week_15.MyException;

public class TooColdCoffeeException extends Throwable {
    public TooColdCoffeeException(){
        super("This coffee is too cold");
    }

    public TooColdCoffeeException(String message){
        super(message);
    }
}
