package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void shouldAddValues() {
        double result = calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void shouldSubtractValues() {
        double result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void shouldMultiplyValues() {
        double result = calculator.multiply(10, 5);
        assertEquals(50, result);
    }

    @Test
    public void shouldDivideValues() {
        double result = calculator.divide(10, 5);
        assertEquals(2, result);
    }

    @Test
    public void shouldNotDivideByZero() {
        double result = calculator.divide(10, 0);
        assertEquals(0, result);
    }
}
