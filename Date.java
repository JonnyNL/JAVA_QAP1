public class Date {
    // Private instance variables for Date
    private int day ;
    private int month;
    private int year;

    // Date constructor with given day, month, and year
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // a method that returns the day
    public int getDay() {
        return day;
    }

    // a method that returns the month
    public int getMonth() {
        return month;
    }

    // a method that returns the year
    public int getYear() {
        return year;
    }

    // a method that overwrites the current day with given day
    public void setDay(int day) {
        this.day = day;
    }

    // a method that overwrites the current month with given month
    public void setMonth(int month) {
        this.month = month;
    }

    // a method that overwrites the current year with given year
    public void setYear(int year) {
        this.year = year;
    }

    // a method that overwrites the date using given day, month, year
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // A method that returns the date in string format
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
