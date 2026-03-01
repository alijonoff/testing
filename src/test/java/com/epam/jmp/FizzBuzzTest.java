package com.epam.jmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void returnsFizzWhenDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.convert(3));
        assertEquals("Fizz", FizzBuzz.convert(6));
    }

    @Test
    void returnsBuzzWhenDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.convert(5));
        assertEquals("Buzz", FizzBuzz.convert(10));
    }

    @Test
    void returnsFizzBuzzWhenDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.convert(15));
        assertEquals("FizzBuzz", FizzBuzz.convert(30));
    }

    @Test
    void returnsNumberAsStringWhenNotDivisibleBy3Or5() {
        assertEquals("1", FizzBuzz.convert(1));
        assertEquals("7", FizzBuzz.convert(7));
        assertEquals("11", FizzBuzz.convert(11));
    }
}