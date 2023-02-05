// Creation of TestTime to test the Time Class.
// Completed by: Darla Ward
// Completed on February 4, 2023

import utils.Time;

public class TestTime{
    public static void main(String[] args) {
        // creating time details
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10,20,25);

        System.out.println("Time 1: " + t1.toString());
        System.out.println("Time 2: " + t2.toString());

        // using functions to go to next second or previous second.
        t1.nextSecond();
        t2.previousSecond();

        // print out of time after functions are used.
        System.out.println("Time 1 Final: " + t1.toString());
        System.out.println("Time 2 Final: " + t2.toString());
    }
}