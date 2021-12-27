// create a new class 'DateTime'
// initialize 6 private member variables
public class DateTime {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    public DateTime (){}

    public DateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // getters for accessing for each private member variable
    public int getYear() {
        return year;
    }

    public int getDay() {
        return month;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setYear(int Year) {this.year = Year;}

    // method for printing the ISO format
    public void printDateTime() {

        System.out.printf("The current time is: %d-%02d-%02dT%02d:%02d:%02d", year, month, day, hour, minute, second);
    }
}