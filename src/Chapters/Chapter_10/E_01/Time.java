package Chapters.Chapter_10.E_01;

public class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {

        long theTime = System.currentTimeMillis();

        this.setTime(theTime);
    }

    public Time(long time) {

        this.setTime(time);

    }

    public Time(long hour, long minute, long Sec) {

        this.second = second;

        this.minute= minute;

        this.hour = hour;

    }

    public void setTime(long elapsedTime) {

        hour = (((elapsedTime / 1000) / 60) / 60) % 24;

        second = (elapsedTime / 1000) % 60;

        minute = ((elapsedTime / 1000) / 60) % 60;


    }

    public long getHour() {

        return hour;

    }

    public long getMinute() {

        return minute;
    }

    public long getSecond() {

        return second;
    }

}
