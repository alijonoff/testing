package com.epam.jmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    @Test
    void emptyStringReturns0() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    void nullReturns0() {
        assertEquals(0, StringCalculator.add(null));
    }

    @Test
    void singleNumberReturnsThatNumber() {
        assertEquals(7, StringCalculator.add("7"));
    }

    @Test
    void twoNumbersCommaSeparated() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    void numbersCanBeSeparatedByNewline() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    void ignoresExtraSeparators() {
        assertEquals(6, StringCalculator.add("1,,2\n\n3"));
    }

    @Test
    void trimsSpaces() {
        assertEquals(6, StringCalculator.add(" 1, 2 \n 3 "));
    }
}