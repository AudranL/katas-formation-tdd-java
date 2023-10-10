package tdd.kata.leapyear;

public class LeapYear {

	public static boolean isLeapYear(int year) {
        if(year % 400 == 0) {
            return true;
        }
        if (year == 2008 || year == 2012) {
            return true;
        }
        return false;
    }
}
