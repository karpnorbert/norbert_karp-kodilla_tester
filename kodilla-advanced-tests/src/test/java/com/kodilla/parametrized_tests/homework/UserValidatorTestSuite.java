package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @Test
    void shouldReturnTrueForValidUsername() {
        assertTrue(userValidator.validateUsername("John123"));
    }

    @Test
    void shouldReturnFalseForInvalidUsername() {
        assertFalse(userValidator.validateUsername(""));
    }

    @Test
    void shouldReturnTrueForValidEmail() {
        assertTrue(userValidator.validateEmail("john.doe@example.com"));
    }

    @Test
    void shouldReturnFalseForInvalidEmail() {
        assertFalse(userValidator.validateEmail("john.doe"));
    }
}
