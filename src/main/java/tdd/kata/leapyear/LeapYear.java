package tdd.kata.leapyear;

public interface LeapYear {

	static boolean isLeapYear(int year) {
        if (isDivisibleBy100ButNotBy400(year)) {
            return false;
        }
        return isDivisibleBy400(year) || isDivisibleBy4(year);
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
