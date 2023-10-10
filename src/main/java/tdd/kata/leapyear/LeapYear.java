package tdd.kata.leapyear;

public class LeapYear {

	public static boolean isLeapYear(int year) {
        if (isDivisibleBy100ButNotBy400(year)) {
            return false;
        }
        if(isDivisibleBy400(year)) {
            return true;
        }
        if (isDivisibleBy4(year)) {
            return true;
        }
        return false;
    }

    private static boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }

    private static boolean isDivisibleBy100ButNotBy400(int year) {
        return year % 100 == 0 && !isDivisibleBy400(year);
    }

    private static boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }
}
