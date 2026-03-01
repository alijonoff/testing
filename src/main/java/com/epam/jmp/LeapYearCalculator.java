package com.epam.jmp;

public final class LeapYearCalculator {

    private LeapYearCalculator() {
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}