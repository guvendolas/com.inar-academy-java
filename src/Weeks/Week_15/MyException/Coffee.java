package Weeks.Week_15.MyException;

public class Coffee {
    private String type;

    public String getType() {
        return type;
    }

    public int getTemp() {
        return temp;
    }

    private int temp;

    public Coffee(int temp) {
        this("Regular",temp);
    }

    public Coffee(String type, int temp) {
        this.type = type;
        this.temp = temp;
    }
}
