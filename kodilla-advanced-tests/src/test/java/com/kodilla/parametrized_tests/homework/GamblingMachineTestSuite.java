package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/testNumbers.csv", numLinesToSkip = 1)
    void shouldCountWinsOrThrowException(String input) {
        Set<Integer> numbers = Arrays.stream(input.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        if (numbers.size() != 6 || numbers.stream().anyMatch(number -> number < 1 || number > 49)) {
            assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
        } else {
            assertDoesNotThrow(() -> gamblingMachine.howManyWins(numbers));
        }
    }
}
