package com.epam.jmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {

    @Test
    void convertsBasicNumbers() {
        assertEquals("I", RomanNumeralConverter.toRoman(1));
        assertEquals("V", RomanNumeralConverter.toRoman(5));
        assertEquals("X", RomanNumeralConverter.toRoman(10));
    }

    @Test
    void convertsSubtractiveCases() {
        assertEquals("IV", RomanNumeralConverter.toRoman(4));
        assertEquals("IX", RomanNumeralConverter.toRoman(9));
        assertEquals("XL", RomanNumeralConverter.toRoman(40));
        assertEquals("XC", RomanNumeralConverter.toRoman(90));
        assertEquals("CD", RomanNumeralConverter.toRoman(400));
        assertEquals("CM", RomanNumeralConverter.toRoman(900));
    }

    @Test
    void convertsCompositeNumbers() {
        assertEquals("LVIII", RomanNumeralConverter.toRoman(58));
        assertEquals("MCMXCIV", RomanNumeralConverter.toRoman(1994));
        assertEquals("MMXXIV", RomanNumeralConverter.toRoman(2024));
    }

    @Test
    void rejectsOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.toRoman(-5));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.toRoman(4000));
    }
}