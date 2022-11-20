package Weeks.Week_15.MyException;

public class TooHotCoffeeException extends Throwable {

    public TooHotCoffeeException(){
        super("This coffee is too hot");
    }

    public TooHotCoffeeException(String message){
        super();
    }
}
