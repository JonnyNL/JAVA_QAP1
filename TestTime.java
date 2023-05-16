public class TestTime {
    public static void main(String[] args) {
        

        // Create a two time objects (t1 and t2). Set their time to 21:10:15 and 10:20:25 using set method

        // Time 1 set using setTime method
        Time t1 = new Time(0, 0 , 0);
        t1.setTime(21, 10, 15);


        // Time 2 set using all other set methods
        Time t2 = new Time(0, 0, 0);
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        // Call nextSecond() for t1 and previousSecond() for t2.
        t1.nextSecond();
        t2.previousSecond();

        // Display the final times for t1 and t2 using toString() method.
        System.out.println("Time 1: " + t1);
        System.out.println("Time 2: " + t2);

    }
}
