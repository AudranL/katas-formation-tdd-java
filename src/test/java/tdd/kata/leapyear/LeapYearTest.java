package tdd.kata.leapyear;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

	@Test
	void year_2017_is_not_leap() {
		assertThat(LeapYear.isLeapYear(2017)).isFalse();
	}

	@Test
	void year_2000_is_leap() {
		assertThat(LeapYear.isLeapYear(2000)).isTrue();
	}

	@Test
	void year_1600_is_leap() {
		assertThat(LeapYear.isLeapYear(1600)).isTrue();
	}
}
