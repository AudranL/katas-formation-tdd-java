package tdd.kata.leapyear;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

	@Test
	void year_2017_is_not_leap() {
		assertThat(LeapYear.isLeapYear(2017)).isFalse();
	}

	@ParameterizedTest
	@ValueSource(ints= {400, 1600, 2000})
	void all_years_divisible_by_400_is_leap_year(int year) {
		assertThat(LeapYear.isLeapYear(year)).isTrue();
	}

	@ParameterizedTest
	@ValueSource(ints= {2008, 2012, 2016})
	void all_years_divisible_by_4_but_not_by_100_are_leap_years(int year){
		assertThat(LeapYear.isLeapYear(year)).isTrue();
	}

	@Test
	void year_1700_is_not_leap() {
		assertThat(LeapYear.isLeapYear(1700)).isFalse();
	}

	@Test
	void year_1800_is_not_leap() {
		assertThat(LeapYear.isLeapYear(1800)).isFalse();
	}
}
