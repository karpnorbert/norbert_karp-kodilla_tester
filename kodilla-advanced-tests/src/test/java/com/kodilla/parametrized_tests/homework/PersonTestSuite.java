package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BMIDataProvider#provideDataForTestingBMI")
    public void shouldCalculateBMICorrectly(double height, double weight, String expected) {
        // Given
        Person person = new Person(height, weight);

        // When
        String result = person.getBMI();

        // Then
        assertEquals(expected, result);
    }
}
