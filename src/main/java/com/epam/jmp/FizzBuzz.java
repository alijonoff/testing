package com.epam.jmp;

public final class FizzBuzz {

    private FizzBuzz() {
    }

    public static String convert(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if (divisibleBy3 && divisibleBy5) return "FizzBuzz";
        if (divisibleBy3) return "Fizz";
        if (divisibleBy5) return "Buzz";
        return String.valueOf(number);
    }
}