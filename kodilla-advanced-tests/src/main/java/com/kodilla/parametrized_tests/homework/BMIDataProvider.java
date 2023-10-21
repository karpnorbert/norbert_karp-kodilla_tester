package com.kodilla.parametrized_tests.homework;

import java.util.stream.Stream;

public class BMIDataProvider {

    public static Stream<Object[]> provideDataForTestingBMI() {
        return Stream.of(
                new Object[]{1.8, 50, "Severely underweight"},
                new Object[]{1.7, 55, "Normal (healthy weight)"},
                new Object[]{1.6, 90, "Obese Class II (Severely obese)"}

        );
    }
}
