package com.epam.jmp;

public final class StringCalculator {

    private StringCalculator() {
    }

    public static int add(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }

        String[] parts = numbers.split("[,\n]");
        int sum = 0;

        for (String part : parts) {
            if (part.isBlank()) continue; // tolerate ",," or "\n\n"
            sum += Integer.parseInt(part.trim());
        }

        return sum;
    }
}