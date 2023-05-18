public class Time {
    
    // private instance variables for Time
    private int hour;
    private int minute;
    private int second;

    // Time constructor with given hour, minute, second
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // method that returns the hour
    public int getHour() {
        return hour;
    }
    
    // method that returns the minute
    public int getMinute() {
        return minute;
    }

    // method that returns the second
    public int getSecond() {
        return second;
    }

    // method that overwrites the hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // method that overwrites the minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // method that overwrites the second
    public void setSecond(int second) {
        this.second = second;
    }


    // a method that sets the time with given hour, minute, second
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // a method that converts the time to a time string
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // a method that adds a second to the current time and returns the new time
    public Time nextSecond() {
        // Add a second
        second++;
        // If the second is greater than or equal to 60 reset it to 0 and add to minutes
        if (second >= 60) {
            second = 0;
            minute++;
            // If the minute is greater than or equal to 60 reset to 0 and add to hours
            if (minute >= 60) {
                minute = 0;
                hour++;
                // If the hour is greater than 24 reset to 0
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }


    // a method that removes a second from the current time and returns the new time
    public Time previousSecond() {
        // remove a second
        second--;
        // if the seconds are less than or equal to 0 reset minute to 59 and take away a minute
        if (second <= 00) {
            second = 59;
            minute--;
            // if the minutes are less than or equal to 0 reset to 59 and take away an hour
            if (minute <= 00) {
                minute = 59;
                hour--;
                // if the current hours are less than or equal to 0 reset the hour to 23
                if (hour <= 00) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
