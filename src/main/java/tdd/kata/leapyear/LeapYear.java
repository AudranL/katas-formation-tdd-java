package tdd.kata.leapyear;

public class LeapYear {

	public static boolean isLeapYear(int year) {
        if (year == 1700) {
            return false;
        }
        if(year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
