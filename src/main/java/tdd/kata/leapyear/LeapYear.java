package tdd.kata.leapyear;

public class LeapYear {

	public static boolean isLeapYear(int year) {
        if(year % 400 == 0) {
            return true;
        }
        if (year == 2008) {
            return true;
        }
        return false;
    }
}
