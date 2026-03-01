package com.epam.jmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {

    @Test
    void leapYearWhenDivisibleBy400() {
        assertTrue(LeapYearCalculator.isLeapYear(2000));
    }

    @Test
    void notLeapYearWhenDivisibleBy100ButNot400() {
        assertFalse(LeapYearCalculator.isLeapYear(1900));
        assertFalse(LeapYearCalculator.isLeapYear(2100));
    }

    @Test
    void leapYearWhenDivisibleBy4ButNot100() {
        assertTrue(LeapYearCalculator.isLeapYear(2024));
        assertTrue(LeapYearCalculator.isLeapYear(1996));
    }

    @Test
    void notLeapYearWhenNotDivisibleBy4() {
        assertFalse(LeapYearCalculator.isLeapYear(2023));
        assertFalse(LeapYearCalculator.isLeapYear(2019));
    }
}