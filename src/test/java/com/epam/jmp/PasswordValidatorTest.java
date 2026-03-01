package com.epam.jmp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void nullIsInvalid() {
        assertFalse(PasswordValidator.isValid(null));
    }

    @Test
    void tooShortIsInvalid() {
        assertFalse(PasswordValidator.isValid("Aa1"));
        assertFalse(PasswordValidator.isValid("Aa1aaaa"));
    }

    @Test
    void mustContainUppercase() {
        assertFalse(PasswordValidator.isValid("password1"));
    }

    @Test
    void mustContainLowercase() {
        assertFalse(PasswordValidator.isValid("PASSWORD1"));
    }

    @Test
    void mustContainDigit() {
        assertFalse(PasswordValidator.isValid("Password"));
    }

    @Test
    void validPassword() {
        assertTrue(PasswordValidator.isValid("Password1"));
        assertTrue(PasswordValidator.isValid("A1bcdefg"));
    }
}