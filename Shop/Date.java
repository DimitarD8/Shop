package Shop;

public class Date {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int min;
    private int seconds;

    public Date(int year, int month,int day) {
        this.year = year;
        this.month = month;
        this.day =day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSeconds() {
        return seconds;
    }
}